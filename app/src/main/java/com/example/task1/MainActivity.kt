package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickRed=findViewById<TextView>(R.id.RedButton)
        val clickGreen=findViewById<TextView>(R.id.GreenButton)
        val clickBlue=findViewById<TextView>(R.id.BlueButton)
        val clickColor=findViewById<TextView>(R.id.ColorClicked)

        clickRed.setOnClickListener{
            clickColor.text="Red was Clicked"
        }

        clickGreen.setOnClickListener{
            clickColor.text="Green was Clicked"
        }

        clickBlue.setOnClickListener{
            clickColor.text="Blue was Clicked"
        }
    }
}