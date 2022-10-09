package com.example.latttt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latttt.Model.Petani
import com.example.latttt.adapter.PetaniAdapter
import com.example.latttt.adapter.PetaniAdapterCv

class Samplecardview : AppCompatActivity() {
    lateinit var rvSample : RecyclerView
    lateinit var petaniAdaptercv: PetaniAdapterCv
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samplerecyclerview)

        rvSample = findViewById(R.id.rvLatihan)

        lPetani = listOf(
            Petani(user="D01",nama="Adindaa",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D02",nama="Anabele",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D03",nama="Arditoo",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D04",nama="Adam",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
            Petani(user="D05",nama="Arfin",jumlahLahan ="50",identifikasi ="40",tambahLahan ="40"),
        )
        petaniAdaptercv = PetaniAdapterCv(lPetani)

        rvSample.apply{
            layoutManager = LinearLayoutManager(this@Samplecardview)
            adapter=petaniAdaptercv

        }
    }
}