package com.asimodabas.kotlingiris

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import org.junit.After
import org.junit.Before

class TaxTest : TestCase() {

    private lateinit var tax : Tax

    @Before
    fun setup(){
        tax = Tax()
    }

    @After
    fun teardown(){

    }

    fun testCalculateTax() {
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)
    }

    fun testCalculateIncome() {
        val netIncome=tax.calculateIncome(200.0,0.2)
        assertThat(netIncome).isEqualTo(160)
    }
}