package documentation.reference

import com.algolia.search.model.IndexName
import documentation.client
import kotlinx.serialization.Serializable
import runBlocking
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
internal class DocQuickStartIndex {

    @Test
    fun snippet1() {
        runBlocking {
            @Serializable
            data class Contact(
                val firstname: String,
                val lastname: String,
                val followers: Int,
                val company: String
            )

            val contacts = listOf(
                Contact("Jimmie", "Barninger", 93, "California Paint"),
                Contact("Warren", "Speach", 42, "Norwalk Crmc")
            )
            val index = client.initIndex(IndexName("contacts"))

            index.apply {
                saveObjects(Contact.serializer(), contacts).wait()
            }
        }
    }
}
