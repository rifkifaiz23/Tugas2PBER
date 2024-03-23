package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val mahasiswaList: List<Mahasiswa>) : RecyclerView.Adapter<Adapter.MahasiswaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_view, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = mahasiswaList[position]
        holder.dataImage.setImageResource(mahasiswa.dataImage)
        holder.dataNama.text = mahasiswa.dataNama
        holder.dataNim.text = mahasiswa.dataNim
    }

    override fun getItemCount(): Int {
        return mahasiswaList.size
    }

    inner class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dataImage: ImageView = itemView.findViewById(R.id.image)
        val dataNama: TextView = itemView.findViewById(R.id.nama)
        val dataNim: TextView = itemView.findViewById(R.id.nim)
    }
}