package com.example.zooanimalapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zooanimalapp.R
import com.example.zooanimalapp.models.Fish
import kotlinx.android.synthetic.main.item_fish.view.*

class FishAdapter : RecyclerView.Adapter<FishAdapter.FishViewHolder>() {
    
    inner class FishViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differCallBack = object : DiffUtil.ItemCallback<Fish>() {
        override fun areItemsTheSame(oldItem: Fish, newItem: Fish): Boolean {
            return oldItem.scientificName == newItem.scientificName
        }

        override fun areContentsTheSame(oldItem: Fish, newItem: Fish): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishViewHolder {
        return FishViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_fish,
                parent,
                false

            )
        )
    }

    override fun onBindViewHolder(holder: FishViewHolder, position: Int) {
        val fish = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(fish.speciesIllustrationPhoto.src).into(iv_fish)
            tv_name.text = fish.speciesName
            tv_science_name.text = fish.scientificName
            setOnClickListener{
                Toast.makeText(holder.itemView.context, "You clicked on item", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }


}