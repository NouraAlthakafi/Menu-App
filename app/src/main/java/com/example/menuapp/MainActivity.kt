package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.mymenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when (item.itemId){
             R.id.itemHome -> {
                 val intent = Intent(this, MainActivity::class.java)
                 startActivity(intent)
                 return true
             }
             R.id.itemAbout -> {
                 val intent = Intent(this, MainActivity2::class.java)
                 startActivity(intent)
                 return true
             }
             R.id.itemHelp -> {
                 val intent = Intent(this, MainActivity3::class.java)
                 startActivity(intent)
                 return true
             }
         }
        return super.onOptionsItemSelected(item)
    }
}