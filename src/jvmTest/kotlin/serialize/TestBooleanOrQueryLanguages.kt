package serialize

import boolean
import com.algolia.search.saas.data.BooleanOrQueryLanguages
import com.algolia.search.saas.data.BooleanOrQueryLanguages.Boolean
import com.algolia.search.saas.data.BooleanOrQueryLanguages.QueryLanguages
import com.algolia.search.saas.data.QueryLanguage.Afrikaans
import com.algolia.search.saas.data.QueryLanguage.Albanian
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
internal class TestBooleanOrQueryLanguages : TestSerializer<BooleanOrQueryLanguages>(BooleanOrQueryLanguages) {

    override val items = listOf(
        Boolean(boolean),
        QueryLanguages(
            Afrikaans,
            Albanian
        )
    )
}