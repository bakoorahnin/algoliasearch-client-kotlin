package client.response

import client.data.Index
import client.data.*
import kotlinx.serialization.Serializable


@Serializable
data class Settings(
    var searchableAttributes: List<Attribute>? = null,
    var attributesForFaceting: List<Attribute>? = null,
    var unretrievableAttributes: List<Attribute>? = null,
    var attributesToRetrieve: List<Attribute>? = null,
    var ranking: List<Ranking>? = null,
    var customRanking: List<CustomRanking>? = null,
    var replicas: List<Index>? = null,
    var maxValuesPerFacet: Int? = null,
    var facetingAfterDistinct: Boolean? = null,
    var sortFacetValuesBy: SortFacetValuesBy? = null,
    var attributesToHighlight: List<Attribute>? = null,
    var attributesToSnippet: List<Snippet>? = null,
    var highlightPreTag: String? = null,
    var highlightPostTag: String? = null,
    var snippetEllipsisText: String? = null,
    var restrictHighlightAndSnippetArrays: Boolean? = null,
    var hitsPerPage: Int? = null,
    var paginationLimitedTo: Int? = null,
    var minWordSizefor1Typo: Int? = null,
    var minWordSizefor2Typos: Int? = null,
    var typoTolerance: TypoTolerance? = null,
    var allowTyposOnNumericTokens: Boolean? = null,
    var disableTypoToleranceOnAttributes: List<Attribute>? = null,
    var disableTypoToleranceOnWords: List<String>? = null,
    var separatorsToIndex: String? = null,
    var ignorePlurals: BooleanOrQueryLanguages? = null,
    var removeStopWords: BooleanOrQueryLanguages? = null,
    var camelCaseAttributes: List<Attribute>? = null,
    var decompoundedAttributes: WordDecompounding? = null,
    var keepDiacriticsOnCharacters: String? = null,
    var queryLanguages: List<QueryLanguage>? = null,
    var enableRules: Boolean? = null,
    var queryType: QueryType? = null,
    var removeWordsIfNoResults: RemoveWordIfNoResults? = null,
    var advancedSyntax: Boolean? = null,
    var optionalWords: List<String>? = null,
    var disablePrefixOnAttributes: List<Attribute>? = null,
    var disableExactOnAttributes: List<Attribute>? = null,
    var exactOnSingleWordQuery: ExactOnSingleWordQuery? = null,
    var alternativesAsExact: AlternativesAsExact? = null,
    var numericAttributesForFiltering: List<NumericAttributeFilter>? = null,
    var allowCompressionOfIntegerArray: Boolean? = null,
    var attributeForDistinct: Attribute? = null,
    var distinct: Int? = null,
    var synonyms: Boolean? = null,
    var replaceSynonymsInHighlight: Boolean? = null,
    var minProximity: Int? = null,
    var responseFields: List<ResponseFields>? = null,
    var maxFacetHits: Int? = null
)