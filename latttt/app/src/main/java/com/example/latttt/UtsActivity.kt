package com.example.latttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class UtsActivity : AppCompatActivity() {
    lateinit var btninsert : Button
    lateinit var btnget : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uts)

        btninsert = findViewById(R.id.btninsert)
        btnget = findViewById(R.id.btnget)
        btninsert.setOnClickListener(View.OnClickListener { view->
            var intent = Intent(this@UtsActivity,MahasiswaInsert::class.java)
            startActivity(intent)
            finish()
        })

        btnget.setOnClickListener(View.OnClickListener { view->
            var intent = Intent(this@UtsActivity,GetAPIActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}