package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter
    private var daftarMahasiwa = mutableListOf<Mahasiswa>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView)
        adapter = Adapter(daftarMahasiwa)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        addData()
    }

    private fun addData(){
        daftarMahasiwa.add(Mahasiswa(R.drawable.p12250113564, "Aqmal Syarif Fadilah", "12250113564",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.p12250113820, "Fadlan Nur Ramadhan", "12250113820",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.p12250113444, "Farhan Fadhila", "12250113444",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.akbar, "M. Ilham Akbar", "12250113387",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.p12250113521, "M. Farhan Aulia Pratama", "12250113521",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.raja, "M. Raja Fahrezy", "12250113812",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.deli, "Nur Delifah", "12250123957",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.ready, "Ready Malik Putra", "12250113761",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.andin, "Restu Kharrisa Andini", "12250124591",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.faiz, "Rifki Faiz Azzurananda", "12250113451",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.salsa, "Salsabila Aurelia Rickardo", "12250121918",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.tasya, "Tasya Dwi Yanti", "12250123081",))
        daftarMahasiwa.add(Mahasiswa(R.drawable.yana, "Yuliana Mislianingsih", "12250123497",))








        adapter.notifyDataSetChanged()

    }

}