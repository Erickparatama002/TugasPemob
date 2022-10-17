package com.example.latttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.ui.AppBarConfiguration
import com.example.latttt.databinding.ActivityMainBinding

class ServiceActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    lateinit var btnGetAPI : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnGetAPI = findViewById(R.id.btnGetAPI)
        btnGetAPI.setOnClickListener(View.OnClickListener { view->
            var intent = Intent(this@ServiceActivity,GetAPIActivity::class.java)
            startActivity(intent)
            finish()
        })

    }
}