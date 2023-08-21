package org.example.dummykobweblibraryforjitpack

import com.varabyte.truthish.assertThat
import kotlin.test.Test

class IsSortedTest {
    @Test
    fun testIsSorted() {
        val a = arrayOf(3, 2, 1)
        val b = arrayOf(1, 2, 3)
        assertThat(sorted(a)).isFalse()
        assertThat(sorted(b)).isTrue()
    }
}
