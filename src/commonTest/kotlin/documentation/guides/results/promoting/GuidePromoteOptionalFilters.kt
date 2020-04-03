package documentation.guides.results.promoting

import com.algolia.search.dsl.attributesForFaceting
import com.algolia.search.dsl.optionalFilters
import com.algolia.search.dsl.query
import com.algolia.search.dsl.settings
import documentation.index
import runBlocking
import kotlin.test.Ignore
import kotlin.test.Test

@Ignore
class GuidePromoteOptionalFilters {

    @Test
    fun snippet1() {
        runBlocking {
            val settings = settings {
                attributesForFaceting {
                    +"can_deliver_quickly"
                }
            }

            index.setSettings(settings)
        }
    }

    @Test
    fun snippet2() {
        runBlocking {
            val query = query("hungry") {
                optionalFilters {
                    and {
                        facet("can_deliver_quickly", true)
                    }
                }
            }

            index.search(query)
        }
    }
}
