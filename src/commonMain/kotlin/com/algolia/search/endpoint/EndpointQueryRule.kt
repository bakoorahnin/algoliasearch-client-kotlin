package com.algolia.search.endpoint

import com.algolia.search.client.RequestOptions
import com.algolia.search.model.IndexName
import com.algolia.search.model.ObjectID
import com.algolia.search.model.queryrule.QueryRule
import com.algolia.search.response.ResponseRules
import com.algolia.search.response.revision.RevisionIndex


interface EndpointQueryRule {

    val indexName: IndexName

    suspend fun saveRule(
        queryRule: QueryRule,
        forwardToReplicas: Boolean? = null,
        requestOptions: RequestOptions? = null
    ): RevisionIndex

    suspend fun saveRules(
        queryRules: List<QueryRule>,
        forwardToReplicas: Boolean? = null,
        clearExistingRules: Boolean? = null,
        requestOptions: RequestOptions? = null
    ): RevisionIndex

    suspend fun getRule(
        objectID: ObjectID,
        requestOptions: RequestOptions? = null
    ): QueryRule

    suspend fun deleteRule(
        objectID: ObjectID,
        forwardToReplicas: Boolean? = null,
        requestOptions: RequestOptions? = null
    ): RevisionIndex

    suspend fun searchRules(
        query: String? = null,
        requestOptions: RequestOptions? = null
    ): ResponseRules

    suspend fun clearRules(
        forwardToReplicas: Boolean? = null,
        requestOptions: RequestOptions? = null
    ): RevisionIndex
}