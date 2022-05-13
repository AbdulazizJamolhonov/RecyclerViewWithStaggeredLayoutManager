package com.example.homework13_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.homework13_3.Adapter.AvengersAdapter
import com.example.homework13_3.Model.AvengersModel

class MainActivity : AppCompatActivity() {
    private var avengersList = ArrayList<AvengersModel>()
    private lateinit var rvAvengers: RecyclerView
    private lateinit var adapter: AvengersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAvengers = findViewById(R.id.rvAvengers)
        rvAvengers.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        adapter = AvengersAdapter(this, avengersList)
        rvAvengers.adapter = adapter

        avengersAssemble()

    }

    private fun avengersAssemble() {
        val avenger1 = AvengersModel(R.drawable.ic_ironman, "Ironman")
        avengersList.add(avenger1)

        val avenger2 = AvengersModel(R.drawable.ic_thor, "Thor")
        avengersList.add(avenger2)

        val avenger3 = AvengersModel(R.drawable.ic_hulk, "Hulk")
        avengersList.add(avenger3)

        val avenger4 = AvengersModel(R.drawable.ic_natasha, "Natasha")
        avengersList.add(avenger4)

        val avenger5 = AvengersModel(R.drawable.ic_hawkeye, "Hawkeye")
        avengersList.add(avenger5)

        val avenger6 = AvengersModel(R.drawable.ic_loki, "Loki")
        avengersList.add(avenger6)

        val avenger7 = AvengersModel(R.drawable.ic_nick, "Nick Fury")
        avengersList.add(avenger7)

        val avenger8 = AvengersModel(R.drawable.ic_captain, "Captain America")
        avengersList.add(avenger8)
    }
}