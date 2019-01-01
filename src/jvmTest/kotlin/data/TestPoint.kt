package data

import client.data.Point
import client.to
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import shouldEqual


@RunWith(JUnit4::class)
internal class TestPoint {

    @Test
    fun dx() {
        val point = 1f to 2f

        point shouldEqual Point(1f, 2f)
    }

    @Test
    fun point() {
        val point = Point(1f, 2f)

        point.raw shouldEqual listOf(1f, 2f)
        1f shouldEqual point.latitude
        2f shouldEqual point.longitude
    }
}