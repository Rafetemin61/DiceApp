package com.example.zaruygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photo : ImageView = findViewById(R.id.imageView)

        val buttonRoll : Button = findViewById(R.id.button)
        buttonRoll.setOnClickListener {
            val randomNumber = rollDice();

            when (randomNumber) {
                1 -> photo.setImageResource(R.drawable.dice1)
                2 -> photo.setImageResource(R.drawable.dice2)
                3 -> photo.setImageResource(R.drawable.dice3)
                4 -> photo.setImageResource(R.drawable.dice4)
                5 -> photo.setImageResource(R.drawable.dice5)
                6 -> photo.setImageResource(R.drawable.dice6)
            }


        }
    }

    private fun rollDice(): Int {
        var randomNumber = (1..6).random();


        return randomNumber;
    }



    }


