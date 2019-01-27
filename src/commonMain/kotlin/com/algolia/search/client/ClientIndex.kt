package com.algolia.search.client

import com.algolia.search.endpoint.EndpointIndex
import com.algolia.search.model.IndexName
import com.algolia.search.model.Scope
import com.algolia.search.response.deletion.DeletionIndex
import com.algolia.search.response.revision.RevisionIndex
import com.algolia.search.serialize.*
import io.ktor.client.request.delete
import io.ktor.client.request.post
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.json
import kotlinx.serialization.list


internal class ClientIndex(
    val client: Client,
    override val indexName: IndexName
) : EndpointIndex,
    Client by client {

    private suspend fun copyOrMove(
        destination: IndexName,
        key: String,
        scopes: List<Scope>? = null,
        requestOptions: RequestOptions?
    ): RevisionIndex {
        return write.retry(requestOptions.computedWriteTimeout, indexName.pathIndexes("/operation")) { path ->
            httpClient.post<RevisionIndex>(path) {
                setRequestOptions(requestOptions)
                body = json {
                    KeyOperation to key
                    KeyDestination to destination.raw
                    scopes?.let { KeyScope to Json.stringify(Scope.list, it) }
                }.toString()
            }
        }
    }

    override suspend fun copyIndex(
        destination: IndexName,
        scopes: List<Scope>?,
        requestOptions: RequestOptions?
    ): RevisionIndex {
        return copyOrMove(destination, KeyCopy, scopes, requestOptions)
    }

    override suspend fun moveIndex(destination: IndexName, requestOptions: RequestOptions?): RevisionIndex {
        return copyOrMove(destination, KeyMove, null, requestOptions)
    }

    override suspend fun deleteIndex(requestOptions: RequestOptions?): DeletionIndex {
        return write.retry(requestOptions.computedWriteTimeout, indexName.pathIndexes()) { path ->
            httpClient.delete<DeletionIndex>(path) {
                setRequestOptions(requestOptions)
            }
        }
    }

    override suspend fun clear(requestOptions: RequestOptions?): RevisionIndex {
        return write.retry(requestOptions.computedWriteTimeout, indexName.pathIndexes("/clear")) { path ->
            httpClient.post<RevisionIndex>(path) {
                setRequestOptions(requestOptions)
                body = ""
            }
        }
    }
}