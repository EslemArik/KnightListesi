package com.eslemarik.knightlistesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ch1 = Character("SoftwareDeveloper","Enes","Whisper")
        val ch2 = Character("XECutioneRr1","Eslem","Whisper")
        val ch3 = Character("Pauinkkk","Suleyman","Clansiz")


        val knightList: ArrayList<Character> = ArrayList()
        knightList.add(ch1)
        knightList.add(ch2)
        knightList.add(ch3)

        val rvKo: RecyclerView = findViewById(R.id.rv_character)
        val layoutManager = LinearLayoutManager(this.baseContext)
        rvKo.layoutManager = layoutManager
        rvKo.adapter = KnightAdapter(knightList,this)


    }
}