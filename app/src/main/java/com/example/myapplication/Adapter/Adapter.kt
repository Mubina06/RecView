package com.example.myapplication.Adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Items
import com.example.myapplication.R

class Adapter(val context: Context, var list: Array<Items>): RecyclerView.Adapter<Adapter.MyHolder>() {


    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var img = itemView.findViewById<ImageView>(R.id.img)
        var tv1 = itemView.findViewById<TextView>(R.id.tv1)
        var tv2 = itemView.findViewById<TextView>(R.id.tv2)
        var main = itemView.findViewById<ConstraintLayout>(R.id.main)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false))
        return itemView
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = list.get(position)
        holder.img.setImageResource(item.img)
        holder.tv1.setText(item.nomi)
        holder.tv2.setText(item.recipes)

        val anim = AnimationUtils.loadAnimation(context, R.anim.item_anim)
        holder.itemView.startAnimation(anim)

    }

    override fun getItemCount(): Int {
        return list.size
    }

}