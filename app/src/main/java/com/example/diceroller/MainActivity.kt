package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.Roll_Button)

        btnRoll.setOnClickListener{
            getRandom()

        }



    }

    private fun getRandom(){
        val randomNum = (1..6).random()
        val tvResult : TextView = findViewById(R.id.Result_TextView)
        tvResult.text = randomNum.toString()

    }
}