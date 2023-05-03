package com.eslemarik.knightlistesi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KnightAdapter (val liste: ArrayList<Character>,val activity: MainActivity): RecyclerView.Adapter<KnightAdapter.KnightViewHolder>() {


    class KnightViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val tvCharName: TextView = view.findViewById(R.id.tv_char_name)
        val tvOwnerName: TextView = view.findViewById(R.id.tv_owner_name)
        val clanName: TextView = view.findViewById(R.id.tv_clan_name)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KnightViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_character_features,parent,false)
        return KnightViewHolder(view)
    }

    override fun getItemCount(): Int {
        return liste.size
    }

    override fun onBindViewHolder(holder: KnightViewHolder, position: Int) {
        val tempKo = liste.get(position)

        holder.tvCharName.text = tempKo.charName
        holder.tvOwnerName.text = tempKo.ownerName
        holder.clanName.text = tempKo.clanName
    }
}