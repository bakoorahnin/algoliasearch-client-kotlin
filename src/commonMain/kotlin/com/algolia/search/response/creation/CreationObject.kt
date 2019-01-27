package com.algolia.search.response.creation

import com.algolia.search.model.ObjectID
import com.algolia.search.model.common.Datable
import com.algolia.search.model.common.Task
import com.algolia.search.model.common.TaskID
import com.algolia.search.serialize.KeyCreatedAt
import com.algolia.search.serialize.KeyObjectID
import com.algolia.search.serialize.KeyTaskID
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CreationObject(
    @SerialName(KeyCreatedAt) override val date: String,
    @SerialName(KeyTaskID) override val taskID: TaskID,
    @SerialName(KeyObjectID) val objectID: ObjectID
) : Datable, Task