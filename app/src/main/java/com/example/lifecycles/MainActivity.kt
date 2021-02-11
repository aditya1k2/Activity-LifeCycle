package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //finish()
        Log.d("MainActivity", "onCreate Called MainActivity1")
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            //finish()
        }
    }

    override fun onStart() {
        Log.d("MainActivity", "onStart Called MainActivity1")
        super.onStart()
    }

    override fun onRestart() {
        Log.d("MainActivity", "onRestart Called MainActivity1")
        super.onRestart()
    }

    override fun onResume() {
        Log.d("MainActivity", "onResume Called MainActivity1")
        super.onResume()
    }

    override fun finish() {
        Log.d("MainActivity", "finish Called MainActivity1")
        super.finish()
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause Called MainActivity1")
        super.onPause()
    }


    override fun onStop() {
        Log.d("MainActivity", "onStop Called MainActivity1")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy Called MainActivity1")
        super.onDestroy()
    }
}
