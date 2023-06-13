package com.example.magtymgyly_pragy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity_players : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView

    // reference for the Main-List RecyclerView
    private var soundRecycler: RecyclerView? = null

    // Main-list item titles will be stored here
    private var gosgyList: ArrayList<soundModel>? = null

    // reference for the RVOneAdapter class
    private var soundAdapter: soundAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players)

        // Linked up with its respective id used in the activity_main.xml
        soundRecycler = findViewById(R.id.recyclerViewOne)

        // Setting the Main-List RecyclerView horizontally
        soundRecycler?.run { layoutManager = LinearLayoutManager(applicationContext,
            LinearLayoutManager.VERTICAL,false)
        }
        gosgyList = ArrayList()

        // Static data are stored one by one in the tutorialList arrayList
        gosgyList!!.add(soundModel("Gurgenin", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Gerekdir", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(soundModel("Magtymguly", R.drawable.magtymguly))

        // The app will show Algorithms Sub-List every time the activity starts
        soundAdapter = soundAdapter(gosgyList!!)
        soundRecycler.run { this!!.adapter = soundAdapter }





        bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.message -> {
                    startActivity(Intent(this, Activity_players::class.java))
                    true
                }
                R.id.settings -> {
                    Toast.makeText(applicationContext,"settings", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> {
                    true
                }
            }
        }
    }
}