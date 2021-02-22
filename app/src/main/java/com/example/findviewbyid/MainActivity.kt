package com.example.findviewbyid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logoImage = findViewById<ImageView>(R.id.androidLogo)

        val nameText = findViewById<TextView>(R.id.name)
        val nicknameText = findViewById<TextView>(R.id.nickname)
        val countryText = findViewById<TextView>(R.id.country)

        val styleOneText = findViewById<TextView>(R.id.style_one)
        val styleTwoText = findViewById<TextView>(R.id.style_two)
        val styleThreeText = findViewById<TextView>(R.id.style_three)
        val styleFourText = findViewById<TextView>(R.id.style_four)

        val clickmeButton = findViewById<Button>(R.id.clickmeButton)

        logoImage.setBackgroundResource(R.drawable.android)

        nameText.text = "Felix Arvid Ulf Kjellberg"
        nicknameText.text = "PewDiePie"
        countryText.text = "Sweden"

        styleOneText.text = "Games"
        styleTwoText.text = "Comedy"
        styleThreeText.text = "React"
        styleFourText.text = "Terror"

        clickmeButton.setOnClickListener {
            Log.e("TAG", "Hello!")
        }
    }
}