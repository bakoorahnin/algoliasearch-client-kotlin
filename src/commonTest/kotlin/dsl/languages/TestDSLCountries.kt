package dsl.languages

import com.algolia.search.dsl.places.DSLCountries
import com.algolia.search.model.places.Country
import shouldEqual
import kotlin.test.Test

internal class TestDSLCountries {

    @Test
    fun default() {
        val dsl = DSLCountries {
            +France
        }

        dsl shouldEqual listOf(
            Country.France
        )
    }

    @Test
    fun countries() {
        DSLCountries().apply {
            Afghanistan shouldEqual Country.Afghanistan
            AlandIslands shouldEqual Country.AlandIslands
            Albania shouldEqual Country.Albania
            Algeria shouldEqual Country.Algeria
            AmericanSamoa shouldEqual Country.AmericanSamoa
            Andorra shouldEqual Country.Andorra
            Angola shouldEqual Country.Angola
            Anguilla shouldEqual Country.Anguilla
            Antarctica shouldEqual Country.Antarctica
            AntiguaAndBarbuda shouldEqual Country.AntiguaAndBarbuda
            Argentina shouldEqual Country.Argentina
            Armenia shouldEqual Country.Armenia
            Aruba shouldEqual Country.Aruba
            Australia shouldEqual Country.Australia
            Austria shouldEqual Country.Austria
            Azerbaijan shouldEqual Country.Azerbaijan
            Bahamas shouldEqual Country.Bahamas
            Bahrain shouldEqual Country.Bahrain
            Bangladesh shouldEqual Country.Bangladesh
            Barbados shouldEqual Country.Barbados
            Belarus shouldEqual Country.Belarus
            Belgium shouldEqual Country.Belgium
            Belize shouldEqual Country.Belize
            Benin shouldEqual Country.Benin
            Bermuda shouldEqual Country.Bermuda
            Bhutan shouldEqual Country.Bhutan
            Bolivia shouldEqual Country.Bolivia
            CaribbeanNetherlands shouldEqual Country.CaribbeanNetherlands
            BosniaAndHerzegovina shouldEqual Country.BosniaAndHerzegovina
            Botswana shouldEqual Country.Botswana
            BouvetIsland shouldEqual Country.BouvetIsland
            Brazil shouldEqual Country.Brazil
            BritishIndianOceanTerritory shouldEqual Country.BritishIndianOceanTerritory
            BruneiDarussalam shouldEqual Country.BruneiDarussalam
            Bulgaria shouldEqual Country.Bulgaria
            BurkinaFaso shouldEqual Country.BurkinaFaso
            Burundi shouldEqual Country.Burundi
            CaboVerde shouldEqual Country.CaboVerde
            Cambodia shouldEqual Country.Cambodia
            Cameroon shouldEqual Country.Cameroon
            Canada shouldEqual Country.Canada
            CaymanIslands shouldEqual Country.CaymanIslands
            CentralAfricanRepublic shouldEqual Country.CentralAfricanRepublic
            Chad shouldEqual Country.Chad
            Chile shouldEqual Country.Chile
            China shouldEqual Country.China
            ChristmasIsland shouldEqual Country.ChristmasIsland
            CocosIslands shouldEqual Country.CocosIslands
            Colombia shouldEqual Country.Colombia
            Comoros shouldEqual Country.Comoros
            RepublicOfTheCongo shouldEqual Country.RepublicOfTheCongo
            DemocraticRepublicOfTheCongo shouldEqual Country.DemocraticRepublicOfTheCongo
            CookIslands shouldEqual Country.CookIslands
            CostaRica shouldEqual Country.CostaRica
            IvoryCoast shouldEqual Country.IvoryCoast
            Croatia shouldEqual Country.Croatia
            Cuba shouldEqual Country.Cuba
            Curacao shouldEqual Country.Curacao
            Cyprus shouldEqual Country.Cyprus
            CzechRepublic shouldEqual Country.CzechRepublic
            Denmark shouldEqual Country.Denmark
            Djibouti shouldEqual Country.Djibouti
            Dominica shouldEqual Country.Dominica
            DominicanRepublic shouldEqual Country.DominicanRepublic
            Ecuador shouldEqual Country.Ecuador
            Egypt shouldEqual Country.Egypt
            ElSalvador shouldEqual Country.ElSalvador
            EquatorialGuinea shouldEqual Country.EquatorialGuinea
            Eritrea shouldEqual Country.Eritrea
            Estonia shouldEqual Country.Estonia
            Eswatini shouldEqual Country.Eswatini
            Ethiopia shouldEqual Country.Ethiopia
            FalklandIslands shouldEqual Country.FalklandIslands
            FaroeIslands shouldEqual Country.FaroeIslands
            Fiji shouldEqual Country.Fiji
            Finland shouldEqual Country.Finland
            France shouldEqual Country.France
            FrenchGuiana shouldEqual Country.FrenchGuiana
            FrenchPolynesia shouldEqual Country.FrenchPolynesia
            FrenchSouthernAndAntarcticLands shouldEqual Country.FrenchSouthernAndAntarcticLands
            Gabon shouldEqual Country.Gabon
            Gambia shouldEqual Country.Gambia
            Georgia shouldEqual Country.Georgia
            Germany shouldEqual Country.Germany
            Ghana shouldEqual Country.Ghana
            Gibraltar shouldEqual Country.Gibraltar
            Greece shouldEqual Country.Greece
            Greenland shouldEqual Country.Greenland
            Grenada shouldEqual Country.Grenada
            Guadeloupe shouldEqual Country.Guadeloupe
            Guam shouldEqual Country.Guam
            Guatemala shouldEqual Country.Guatemala
            BailiwickOfGuernsey shouldEqual Country.BailiwickOfGuernsey
            Guinea shouldEqual Country.Guinea
            GuineaBissau shouldEqual Country.GuineaBissau
            Guyana shouldEqual Country.Guyana
            Haiti shouldEqual Country.Haiti
            HeardIslandAndMcDonaldIslands shouldEqual Country.HeardIslandAndMcDonaldIslands
            VaticanCity shouldEqual Country.VaticanCity
            Honduras shouldEqual Country.Honduras
            HongKong shouldEqual Country.HongKong
            Hungary shouldEqual Country.Hungary
            Iceland shouldEqual Country.Iceland
            India shouldEqual Country.India
            Indonesia shouldEqual Country.Indonesia
            Iran shouldEqual Country.Iran
            Iraq shouldEqual Country.Iraq
            Ireland shouldEqual Country.Ireland
            IsleOfMan shouldEqual Country.IsleOfMan
            Israel shouldEqual Country.Israel
            Italy shouldEqual Country.Italy
            Jamaica shouldEqual Country.Jamaica
            Japan shouldEqual Country.Japan
            Jersey shouldEqual Country.Jersey
            Jordan shouldEqual Country.Jordan
            Kazakhstan shouldEqual Country.Kazakhstan
            Kenya shouldEqual Country.Kenya
            Kiribati shouldEqual Country.Kiribati
            NorthKorea shouldEqual Country.NorthKorea
            SouthKorea shouldEqual Country.SouthKorea
            Kuwait shouldEqual Country.Kuwait
            Kyrgyzstan shouldEqual Country.Kyrgyzstan
            Laos shouldEqual Country.Laos
            Latvia shouldEqual Country.Latvia
            Lebanon shouldEqual Country.Lebanon
            Lesotho shouldEqual Country.Lesotho
            Liberia shouldEqual Country.Liberia
            Libya shouldEqual Country.Libya
            Liechtenstein shouldEqual Country.Liechtenstein
            Lithuania shouldEqual Country.Lithuania
            Luxembourg shouldEqual Country.Luxembourg
            Macau shouldEqual Country.Macau
            Madagascar shouldEqual Country.Madagascar
            Malawi shouldEqual Country.Malawi
            Malaysia shouldEqual Country.Malaysia
            Maldives shouldEqual Country.Maldives
            Mali shouldEqual Country.Mali
            Malta shouldEqual Country.Malta
            MarshallIslands shouldEqual Country.MarshallIslands
            Martinique shouldEqual Country.Martinique
            Mauritania shouldEqual Country.Mauritania
            Mauritius shouldEqual Country.Mauritius
            Mayotte shouldEqual Country.Mayotte
            Mexico shouldEqual Country.Mexico
            Micronesia shouldEqual Country.Micronesia
            Moldova shouldEqual Country.Moldova
            Monaco shouldEqual Country.Monaco
            Mongolia shouldEqual Country.Mongolia
            Montenegro shouldEqual Country.Montenegro
            Montserrat shouldEqual Country.Montserrat
            Morocco shouldEqual Country.Morocco
            Mozambique shouldEqual Country.Mozambique
            Myanmar shouldEqual Country.Myanmar
            Namibia shouldEqual Country.Namibia
            Nauru shouldEqual Country.Nauru
            Nepal shouldEqual Country.Nepal
            Netherlands shouldEqual Country.Netherlands
            NewCaledonia shouldEqual Country.NewCaledonia
            NewZealand shouldEqual Country.NewZealand
            Nicaragua shouldEqual Country.Nicaragua
            Niger shouldEqual Country.Niger
            Nigeria shouldEqual Country.Nigeria
            Niue shouldEqual Country.Niue
            NorfolkIsland shouldEqual Country.NorfolkIsland
            NorthMacedonia shouldEqual Country.NorthMacedonia
            NorthernMarianaIslands shouldEqual Country.NorthernMarianaIslands
            Norway shouldEqual Country.Norway
            Oman shouldEqual Country.Oman
            Pakistan shouldEqual Country.Pakistan
            Palau shouldEqual Country.Palau
            Palestine shouldEqual Country.Palestine
            Panama shouldEqual Country.Panama
            PapuaNewGuinea shouldEqual Country.PapuaNewGuinea
            Paraguay shouldEqual Country.Paraguay
            Peru shouldEqual Country.Peru
            Philippines shouldEqual Country.Philippines
            PitcairnIslands shouldEqual Country.PitcairnIslands
            Poland shouldEqual Country.Poland
            Portugal shouldEqual Country.Portugal
            PuertoRico shouldEqual Country.PuertoRico
            Qatar shouldEqual Country.Qatar
            Reunion shouldEqual Country.Reunion
            Romania shouldEqual Country.Romania
            Russia shouldEqual Country.Russia
            Rwanda shouldEqual Country.Rwanda
            SaintBarthelemy shouldEqual Country.SaintBarthelemy
            SaintHelena shouldEqual Country.SaintHelena
            SaintKittsAndNevis shouldEqual Country.SaintKittsAndNevis
            SaintLucia shouldEqual Country.SaintLucia
            SaintMartin shouldEqual Country.SaintMartin
            SaintPierreAndMiquelon shouldEqual Country.SaintPierreAndMiquelon
            SaintVincentAndTheGrenadines shouldEqual Country.SaintVincentAndTheGrenadines
            Samoa shouldEqual Country.Samoa
            SanMarino shouldEqual Country.SanMarino
            SaoTomeAndPrincipe shouldEqual Country.SaoTomeAndPrincipe
            SaudiArabia shouldEqual Country.SaudiArabia
            Senegal shouldEqual Country.Senegal
            Serbia shouldEqual Country.Serbia
            Seychelles shouldEqual Country.Seychelles
            SierraLeone shouldEqual Country.SierraLeone
            Singapore shouldEqual Country.Singapore
            SintMaarten shouldEqual Country.SintMaarten
            Slovakia shouldEqual Country.Slovakia
            Slovenia shouldEqual Country.Slovenia
            SolomonIslands shouldEqual Country.SolomonIslands
            Somalia shouldEqual Country.Somalia
            SouthAfrica shouldEqual Country.SouthAfrica
            SouthGeorgiaAndTheSouthSandwichIslands shouldEqual Country.SouthGeorgiaAndTheSouthSandwichIslands
            SouthSudan shouldEqual Country.SouthSudan
            Spain shouldEqual Country.Spain
            SriLanka shouldEqual Country.SriLanka
            Sudan shouldEqual Country.Sudan
            Suriname shouldEqual Country.Suriname
            SvalbardAndJanMayen shouldEqual Country.SvalbardAndJanMayen
            Sweden shouldEqual Country.Sweden
            Switzerland shouldEqual Country.Switzerland
            Syria shouldEqual Country.Syria
            Taiwan shouldEqual Country.Taiwan
            Tajikistan shouldEqual Country.Tajikistan
            Tanzania shouldEqual Country.Tanzania
            Thailand shouldEqual Country.Thailand
            TimorLeste shouldEqual Country.TimorLeste
            Togo shouldEqual Country.Togo
            Tokelau shouldEqual Country.Tokelau
            Tonga shouldEqual Country.Tonga
            TrinidadAndTobago shouldEqual Country.TrinidadAndTobago
            Tunisia shouldEqual Country.Tunisia
            Turkey shouldEqual Country.Turkey
            Turkmenistan shouldEqual Country.Turkmenistan
            TurksAndCaicosIslands shouldEqual Country.TurksAndCaicosIslands
            Tuvalu shouldEqual Country.Tuvalu
            Uganda shouldEqual Country.Uganda
            Ukraine shouldEqual Country.Ukraine
            UnitedArabEmirates shouldEqual Country.UnitedArabEmirates
            UnitedKingdom shouldEqual Country.UnitedKingdom
            UnitedStates shouldEqual Country.UnitedStates
            UnitedStatesMinorOutlyingIslands shouldEqual Country.UnitedStatesMinorOutlyingIslands
            Uruguay shouldEqual Country.Uruguay
            Uzbekistan shouldEqual Country.Uzbekistan
            Vanuatu shouldEqual Country.Vanuatu
            Venezuela shouldEqual Country.Venezuela
            Vietnam shouldEqual Country.Vietnam
            VirginIslandsGB shouldEqual Country.VirginIslandsGB
            VirginIslandsUS shouldEqual Country.VirginIslandsUS
            WallisAndFutuna shouldEqual Country.WallisAndFutuna
            WesternSahara shouldEqual Country.WesternSahara
            Yemen shouldEqual Country.Yemen
            Zambia shouldEqual Country.Zambia
            Zimbabwe shouldEqual Country.Zimbabwe
        }
    }
}
