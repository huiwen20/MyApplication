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




        imageViewCasualCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Casual Image.", Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(this, CasualDetailsActivity::class.java)
            startActivity(intent)
        }


        imageViewDatingCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Dating Image.", Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(this, DatingDetailsActivity::class.java)
            startActivity(intent)

        }


        imageViewFormalCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Formal Image.", Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(this, FormalDetailsActivity::class.java)
            startActivity(intent)

        }


        imageViewDinnerCat.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "You clicked on Dinner Image.", Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(this, DinnerDetailsActivity::class.java)
            startActivity(intent)

        }
        
    }
}
