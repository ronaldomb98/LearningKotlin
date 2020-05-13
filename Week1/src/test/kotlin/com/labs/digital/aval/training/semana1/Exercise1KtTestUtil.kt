package com.labs.digital.aval.training.semana1

import org.junit.Assert.assertEquals

internal fun testEvaluation(secret: String, guess: String, rightPosition: Int, wrongPosition: Int) {
    val expected = CorrectAndWrong(rightPosition, wrongPosition)
    val actual = evaluate(secret, guess)
    assertEquals("Wrong evaluation for secret=$secret, guess=$guess", expected, actual)
}
