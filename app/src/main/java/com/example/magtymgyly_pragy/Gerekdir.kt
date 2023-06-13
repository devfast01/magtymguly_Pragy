package com.example.magtymgyly_pragy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class Gerekdir : AppCompatActivity() {

    // Declaring TextView from the Layout
    private lateinit var textview: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerekdir)

        // initializing the TextView
        textview = findViewById(R.id.gerekdir)

        // Creating a string that contains the information to be displayed
        val para = """                       Gerekdir
            
   «Menem» diýen goç ýigide
   Bir mynasyp ýar gerekdir.
   Arap at, ýowly ýigide
   Almaz zülpükar gerekdir.
  
   Ýigit öler ýurt üstünde,
   Janyn berip ar üstünde,
   Goç ýigitler il üstünde
   Namys bilen ar gerekdir.
  
   Bäş gün köňül hoş etmäge,
   Saçak ýazyp, nan dökmäge,
   Abraý alyp, at etmäge,
   Golda bendi-bar gerekdir.
  
   Mekgä baran bolar hajy,
   Aýralyk ölümden ajy.
   Goç ýigide ar galyjy,
   Aşyga didar gerekdir.
  
   Artdyr pelek ahy-zaryň,
   Alar elden ygtyýaryň.
   Magtymguly, söwer ýaryň
   Syýa zülpi tar gerekdir.
                
                   """

        // set value to the given TextView
        textview.text = para

        // to perform the movement action
        // Moves the cursor or scrolls to the
        // top or bottom of the document
        textview.movementMethod = ScrollingMovementMethod()


    }
}