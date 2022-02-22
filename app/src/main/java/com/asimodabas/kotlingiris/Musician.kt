package com.asimodabas.kotlingiris

import javax.inject.Inject

class Musician
@Inject
constructor(instrument: Instrument, band: Band) {

    fun sing() {
        println("work")
    }
}