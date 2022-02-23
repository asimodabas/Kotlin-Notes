package com.asimodabas.kotlingiris

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase

class TaxTest : TestCase() {

    fun testCalculateTax() {
        val tax = Tax()
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    fun testCalculateIncome() {}
}