package com.example.magtymgyly_pragy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.akexorcist.localizationactivity.ui.LocalizationActivity

class language_changer : LocalizationActivity() {

    lateinit var btnEnglish : Button
    lateinit var btnRussian : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_changer)

        btnEnglish = findViewById(R.id.btnEngish)
        btnRussian = findViewById(R.id.btnRussian)

        btnEnglish.setOnClickListener {
            setLanguage("en")
        }

        btnRussian.setOnClickListener {
            setLanguage("ru")
        }

    }

}