package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCasual.setOnClickListener {
            val intent = Intent(this, CasualActivity::class.java)
            startActivity(intent)
        }

        buttonDating.setOnClickListener {
            val intent = Intent(this, DatingActivity::class.java)
            startActivity(intent)
        }

        buttonDinner.setOnClickListener {
            val intent = Intent(this, DinnerActivity::class.java)
            startActivity(intent)
        }

        buttonFormal.setOnClickListener {
            val intent = Intent(this, FormalActivity::class.java)
            startActivity(intent)
        }

        // get reference to ImageView
        val ivClickCasualCat = findViewById(R.id.imageViewCasualCat) as ImageView
        // set on-click listener
        ivClickCasualCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Casual Image.", Toast.LENGTH_SHORT)
                .show()

        }

        // get reference to ImageView
        val ivClickDatingCat = findViewById(R.id.imageViewDatingCat) as ImageView
        // set on-click listener
        ivClickDatingCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Dating Image.", Toast.LENGTH_SHORT)
                .show()

        }

        // get reference to ImageView
        val ivClickFormalCat = findViewById(R.id.imageViewFormalCat) as ImageView
        // set on-click listener
        ivClickFormalCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Formal Image.", Toast.LENGTH_SHORT)
                .show()

        }

        // get reference to ImageView
        val ivClickDinnerCat = findViewById(R.id.imageViewDinnerCat) as ImageView
        // set on-click listener
        ivClickDinnerCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Dinner Image.", Toast.LENGTH_SHORT)
                .show()

        }
        
    }
}
