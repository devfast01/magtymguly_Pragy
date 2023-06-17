package com.example.magtymgyly_pragy

import android.os.Bundle
import android.widget.Button
import com.akexorcist.localizationactivity.ui.LocalizationActivity

class language_changer : LocalizationActivity() {

    lateinit var btnEnglish : Button
    lateinit var btnRussian : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_changer)

        btnEnglish = findViewById(R.id.btnJapan)
        btnRussian = findViewById(R.id.btnTurkmen)

        btnEnglish.setOnClickListener {
            setLanguage("en")
        }

        btnRussian.setOnClickListener {
            setLanguage("ru")
        }

    }

}