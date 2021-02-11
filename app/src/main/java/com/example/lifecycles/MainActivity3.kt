package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
//            finish()
//            onBackPressed()
        }
    }

    override fun onStart() {
        Log.d("MainActivity", "onStart Called MainActivity3")
        super.onStart()
    }

    override fun finish() {
        Log.d("MainActivity", "finish Called MainActivity3")
        super.finish()

    }

    override fun onRestart() {
        Log.d("MainActivity", "onRestart Called MainActivity3")
        super.onRestart()
    }

    override fun onResume() {
        Log.d("MainActivity", "onResume Called MainActivity3")
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause Called MainActivity3")
        super.onPause()
    }


    override fun onStop() {
        Log.d("MainActivity", "onStop Called MainActivity3")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy Called MainActivity3")
        super.onDestroy()
    }


}