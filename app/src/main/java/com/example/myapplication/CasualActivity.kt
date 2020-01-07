package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.layout.activity_casual
import com.example.myapplication.R.layout.details_casual
import kotlinx.android.synthetic.main.activity_casual.*

class CasualActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_casual)

        imageViewCasual3.setOnClickListener {
            val intent = Intent(this, CasualDetailsActivity::class.java)
            startActivity(intent)
        }

    }
}