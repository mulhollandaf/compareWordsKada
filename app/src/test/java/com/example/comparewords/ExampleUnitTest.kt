package com.example.comparewords

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CompareWordsUnitTest {
    @Test
    fun testHasSameLetterFalse() {
        val result = hasSameLetters("a", "i")
        assertFalse(result)
    }

    @Test
    fun testHasSameLetterTrue() {
        val result = hasSameLetters("i", "i")
        assertTrue(result)
    }

    private fun hasSameLetters (firstWord: String, secondWord: String):Boolean {
        firstWord.toCharArray().forEach {
            val sameLetter = compareAllLetters(it, secondWord)
            if (sameLetter){
                return true
            }
        }
        return false
    }

    private fun compareAllLetters(letter: Char, secondWord: String): Boolean {
        secondWord.toCharArray().forEach {
           if (letter == it) {
               return true
           }
        }
        return false
    }

    @Test
    fun testHasSameLettersTrue(){
        val result = hasSameLetters("bacon", "word")
        assertTrue(result)
    }

    @Test
    fun testHasSameLettersFalse(){
        val result = hasSameLetters("avakado", "cheese")
        assertFalse(result)
    }
}
