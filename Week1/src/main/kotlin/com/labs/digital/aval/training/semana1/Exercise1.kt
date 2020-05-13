package com.labs.digital.aval.training.semana1

import java.util.*

val MAX_LENGTH = 4;

data class CorrectAndWrong(val rightPosition: Int, val wrongPosition: Int)

fun evaluate(secret: String, guess: String): CorrectAndWrong {
    var rightPosition = 0
    var wrongPosition = 0
    val guessList = guess.toMutableList()

    for ((i, value) in secret.toCharArray().withIndex()) {
        if (shouldIncrementRightPosition(i, value, guess)) {
            rightPosition++
            guessList.remove(value)
        }
        else if (shouldIncrementWrongPosition(secret.slice(IntRange(i, secret.length-1)), guessList, value)) {
            wrongPosition++
        }
    }

    return CorrectAndWrong(rightPosition, wrongPosition)
}

fun shouldIncrementRightPosition(i: Int, value: Char, guess: String): Boolean {
    return value == guess[i]
}

fun shouldIncrementWrongPosition(secret: String, guess: MutableList<Char>, char: Char): Boolean {
    val secretCount = secret.count { it == char }
    val guessCount = guess.count { it == char }

    return secretCount == guessCount || guessCount > secretCount
}

fun containsExactLength(input: String): Boolean {
    return input.length == MAX_LENGTH
}

fun containsOnlyLetters(input: String): Boolean {
    val chars = input.toCharArray()

    for (char in chars){
        if (!char.isLetter()) return false
    }

    return true
}

fun isValidInput(input: String) : Boolean {
    return containsExactLength(input) && containsOnlyLetters(input)
}

fun getInputType(type: String): String {
    val reader = Scanner(System.`in`)
    var input = "";

    do {
        print("${type}: ")
        input = reader.nextLine()
    } while (!isValidInput(input))

    return input
}

fun main() {
    val secret = getInputType("SECRET")
    val guess = getInputType("GUESS")
    val correctAndWrong: CorrectAndWrong = evaluate(secret, guess)

    println(correctAndWrong)
}
