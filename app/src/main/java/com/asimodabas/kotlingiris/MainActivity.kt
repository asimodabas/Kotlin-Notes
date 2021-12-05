package com.asimodabas.kotlingiris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Lambda expressions

        fun printString(myString : String) {
            println(myString)
        }

        printString("My Test String")

        val testString = {myString : String -> println(myString)}

        testString("My Lambda String")

        val multiplyLambda = {a: Int, b: Int -> a * b }
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,5))

    }

}