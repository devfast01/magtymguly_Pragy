package com.example.magtymgyly_pragy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import com.akexorcist.localizationactivity.ui.LocalizationActivity

class goze_myhman : LocalizationActivity() {

    // Declaring TextView from the Layout
    private lateinit var textview: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goze_myhman)

        // initializing the TextView
        textview = findViewById(R.id.myhaman)

        // set value to the given TextView
        textview.text = getString(R.string.gozle_myhmandyr)

        // to perform the movement action
        // Moves the cursor or scrolls to the
        // top or bottom of the document
        textview.movementMethod = ScrollingMovementMethod()


    }
}