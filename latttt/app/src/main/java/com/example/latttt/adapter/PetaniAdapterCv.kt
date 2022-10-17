package com.example.latttt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.latttt.Model.Petani
import com.example.latttt.R


class PetaniAdapterCv(val petani: List<Petani>):
    RecyclerView.Adapter<PetaniAdapterCv.PetaniHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PetaniAdapterCv.PetaniHolder {
        return(
        PetaniHolder(LayoutInflater.from(parent.context).inflate(R.layout.cv_item_dutatani,
            parent, false)))
    }
    override fun onBindViewHolder(holder: PetaniAdapterCv.PetaniHolder, position: Int) {
        holder.bindPetani(petani[position])
    }
    override fun getItemCount(): Int {
        return petani.size
    }
    class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUser: TextView
        lateinit var txtNama: TextView
        lateinit var txtJumlahLahan: TextView
        lateinit var txtIdentifikasi: TextView
        lateinit var txtTambahLahan: TextView

        fun bindPetani(petani: Petani) {
            itemView.apply {
                txtUser = findViewById(R.id.txtuser)
                txtNama = findViewById(R.id.txtnim)
                txtJumlahLahan = findViewById(R.id.txtjumlahlahan)
                txtIdentifikasi = findViewById(R.id.txtidentifikasi)
                txtTambahLahan = findViewById(R.id.txttambahlahan)

                txtUser.text = petani.user
                txtNama.text = petani.nama
                txtJumlahLahan.text = petani.jumlahLahan
                txtIdentifikasi.text = petani.identifikasi
                txtTambahLahan.text = petani.tambahLahan
            }
        }
    }

    }

