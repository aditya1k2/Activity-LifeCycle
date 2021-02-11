package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("MainActivity", "onCreate Called MainActivity2")

        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
//            finish()
            //onBackPressed()

        }
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d("MainActivity", "onStart Called MainActivity2")
        super.onStart()
    }
    override fun finish() {
        Log.d("MainActivity", "finish Called MainActivity2")
        super.finish()

    }

    override fun onRestart() {
        Log.d("MainActivity", "onRestart Called MainActivity2")
        super.onRestart()
    }

    override fun onResume() {
        Log.d("MainActivity", "onResume Called MainActivity2")
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause Called MainActivity2")
        super.onPause()
    }


    override fun onStop() {
        Log.d("MainActivity", "onStop Called MainActivity2")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy Called MainActivity2")
        super.onDestroy()
    }
}