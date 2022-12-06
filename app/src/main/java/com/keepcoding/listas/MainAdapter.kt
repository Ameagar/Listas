package com.keepcoding.listas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.keepcoding.listas.databinding.MainItemBinding


class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val binding: MainItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            if(position%2==0){
                binding.tvName.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                binding.tvAge.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
            }
            else{
                binding.tvName.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
                binding.tvAge.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
            }
            binding.tvName.text = "Name $position"
            binding.tvAge.text = "$position"
        }
    }

    override fun getItemCount(): Int {
        return 40
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(MainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(position)
    }
}