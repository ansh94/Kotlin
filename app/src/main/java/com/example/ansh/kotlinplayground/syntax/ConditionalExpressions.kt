package com.example.ansh.kotlinplayground.syntax

/**
 * Created by ansh on 06/02/18.
 */
fun biggestWord(someWord: String, anotherWord: String): String {
    if (someWord.length > anotherWord.length) {
        return someWord
    } else {
        return anotherWord
    }
}

fun biggestWordOneLine(someWord: String, anotherWord: String): String {
    return if (someWord.length > anotherWord.length) someWord else anotherWord
}

fun biggestWordAsExpression(someWord: String, anotherWord: String) =
        if (someWord.length > anotherWord.length) someWord else anotherWord