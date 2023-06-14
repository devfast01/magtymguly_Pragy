package com.example.magtymgyly_pragy

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magtymgyly_pragy.RVOneAdapter.OnItemsClickListener
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView

    // reference for the Main-List RecyclerView
    private var RVOne: RecyclerView? = null

    // Main-list item titles will be stored here
    private var gosgyList: ArrayList<RVOneModel>? = null

    // reference for the RVOneAdapter class
    private var rvOneAdapter: RVOneAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Linked up with its respective id used in the activity_main.xml
        RVOne = findViewById(R.id.recyclerViewOne)

        // Setting the Main-List RecyclerView horizontally
        RVOne?.run { layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)}
        gosgyList = ArrayList()

        // Static data are stored one by one in the tutorialList arrayList
        gosgyList!!.add(RVOneModel("Gurgenin", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Gerekdir", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Magtymguly", R.drawable.magtymguly))
        gosgyList!!.add(RVOneModel("Magtymguly", R.drawable.magtymguly))



        // The app will show Algorithms Sub-List every time the activity starts
        rvOneAdapter = RVOneAdapter(gosgyList!!)
        RVOne.run { this!!.adapter = rvOneAdapter }

        // Setting up the events that will occur on each Main-List item click
        rvOneAdapter!!.setWhenClickListener(object : OnItemsClickListener {
            override fun onItemClick(positon: Int) {
//                val intent = Intent(this@MainActivity, Activity_gosgy::class.java)
//                startActivity(intent)
                when (positon) {
                    0 ->{
                        val intent = Intent(this@MainActivity, Gurgenin::class.java)
                        startActivity(intent)
                    }
                    1 ->{
                        val intent = Intent(this@MainActivity, Gerekdir::class.java)
                        startActivity(intent)
                    }
                    2 ->Toast.makeText(applicationContext, "uc:",Toast.LENGTH_SHORT).show()
                    else -> { // Note the block

                    }
                }

                //Toast.makeText(applicationContext, "Position: $positon",Toast.LENGTH_SHORT).show()
            }
        })

        bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    Toast.makeText(applicationContext,"Current Page",Toast.LENGTH_SHORT).show()
//                    startActivity(Intent(this, Activity_players::class.java))
                    true
                }
                R.id.message -> {
                    startActivity(Intent(this, Activity_players::class.java))
                    true
                }
                R.id.settings -> {
                    startActivity(Intent(this, language_changer::class.java))
                    true
                }

                else -> {
                    true
                }
            }
        }
    }
}

