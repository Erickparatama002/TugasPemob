package com.example.latttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.ui.AppBarConfiguration
import com.example.latttt.databinding.ActivityMainBinding

class ServiceActivity : AppCompatActivity() {
    lateinit var btnGetAPI : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnGetAPI = findViewById(R.id.btnGetAPI)
        btnGetAPI.setOnClickListener(View.OnClickListener { view->
            var intent = Intent(this@ServiceActivity,GetAPIActivity::class.java)
            startActivity(intent)
            finish()
        })

    }
}