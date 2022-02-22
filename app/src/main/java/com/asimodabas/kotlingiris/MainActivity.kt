package com.asimodabas.kotlingiris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    private lateinit var lars : Musician

    private lateinit var navigationController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this, navigationController)

        Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_LONG).show()

        /*
        val instrument = Instrument()
        val band = Band()
        var james = Musician(instrument, band)
        james.sing()
         */

        lars.sing()


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController, null)
    }


    fun save() {

        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure?")

        alert.setPositiveButton("Yes") { dialog, which ->

            //OnClick Listener
            Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") { dialog, which ->

            //OnClick Listener
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()

        }

        alert.show()

        //Lambda expressions

        fun printString(myString: String) {
            println(myString)
        }

        printString("My Test String")

        val testString = { myString: String -> println(myString) }

        testString("My Lambda String")

        val multiplyLambda = { a: Int, b: Int -> a * b }
        println(multiplyLambda(5, 4))

        val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
        println(multiplyLambda2(5, 5))

        //asynchrnous

        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion: () -> Unit) {
            //url -> download
            //data

            completion()
        }

        downloadMusicians("url.com", { -> println("Completed && Ready") })

    }

}