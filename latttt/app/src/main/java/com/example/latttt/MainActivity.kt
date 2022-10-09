package com.example.latttt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.latttt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    lateinit var btnrv : Button
    lateinit var btncv : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnrv = findViewById(R.id.btnrv)
        btncv = findViewById(R.id.btncv)

        btnrv.setOnClickListener(View.OnClickListener { view->
        var intent = Intent(this@MainActivity,Samplerecyclerview::class.java)
        startActivity(intent)
        finish()
    })
        btncv.setOnClickListener(View.OnClickListener { view->
            var intent = Intent(this@MainActivity,Samplecardview::class.java)
            startActivity(intent)
            finish()
        })
    }



}