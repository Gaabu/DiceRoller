package com.example.diceroller20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val rollButton2: Button = findViewById(R.id.roll_button2)

        rollButton.setOnClickListener { rollDice() }
        rollButton2.setOnClickListener {countUP()}

    }


    private fun rollDice(){

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView  = findViewById(R.id.result_text3)
        val rnds = (1..6).random()
        val rnds2 = (1..6).random()
        val rnds3 = (1..6).random()

        resultText.text = rnds.toString()
        resultText2.text = rnds2.toString()
        resultText3.text = rnds3.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun countUP(){
        val showResult : TextView = findViewById(R.id.result_text)
        val showResult2: TextView = findViewById(R.id.show_result)

        val result1 = "Hello Friend!"
        val num1 = 1
        val parseInt = Integer.parseInt(showResult.text.toString()) + 1


        if(showResult.text == result1){
            showResult2.text = num1.toString()
        }else if(showResult.text == "6"){
            showResult2.text = "6"
        }else {
            showResult2.text = parseInt.toString()
        }
    }
}
