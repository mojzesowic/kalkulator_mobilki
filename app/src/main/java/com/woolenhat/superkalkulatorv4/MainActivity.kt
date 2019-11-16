package com.woolenhat.superkalkulatorv4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simple.setOnClickListener {
            val intent = Intent(this, Simple::class.java)
            startActivity(intent)
        }
        advanced.setOnClickListener {
            val intent = Intent(this, Advanced::class.java)
            startActivity(intent)
        }
        about.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
        exit.setOnClickListener {
            moveTaskToBack(true);
            System.exit(-1)
        }
    }
}
