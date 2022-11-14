package com.example.jobshett21_norhidayahhhh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "MAYA INDAH LESTARI",
        "MUHAMAD KHUSNU MAROM",
        "MUHAMMAD HUDA GUNAWAN",
        "MUTMAINAH SEPTIARINI",
        "NASYWA SUKRIA HANIFA",
        "NOR HIDAYAH FITRIANI",
        "NOVITA SARI",
        "NUR IZZA",
        "RISKA ANGGUN ANGRIANI",
        "SAHRUL LUKMAN HAKIM",
        "SETYA NENG RAHAYU",
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.KelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}