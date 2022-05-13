package com.example.homework13_3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.homework13_3.*
import com.example.homework13_3.Model.AvengersModel

class AvengersAdapter(private val context: Context, private var avengersList: List<AvengersModel>) :
    RecyclerView.Adapter<AvengersAdapter.AvengersViewModel>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvengersViewModel {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_row, parent, false)
        return AvengersViewModel(view)
    }

    override fun onBindViewHolder(holder: AvengersViewModel, position: Int) {
        val avengerList = avengersList[position]
        holder.ivAvengers.setImageResource(avengerList.image)
        holder.tvName.text = avengerList.name

        holder.itemView.setOnClickListener {
            Toast.makeText(context, "" + avengerList.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return avengersList.size
    }

    class AvengersViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivAvengers = itemView.findViewById<ImageView>(R.id.ivAvengers)
        val tvName = itemView.findViewById<TextView>(R.id.tvName);
    }
}