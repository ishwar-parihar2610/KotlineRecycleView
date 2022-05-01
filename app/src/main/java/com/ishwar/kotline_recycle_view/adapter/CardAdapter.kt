package com.ishwar.kotline_recycle_view.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ishwar.kotline_recycle_view.R
import com.ishwar.kotline_recycle_view.databinding.ActivityMainBinding
import com.ishwar.kotline_recycle_view.databinding.CardLayoutBinding

class CardAdapter : RecyclerView.Adapter<CardAdapter.ViewHolder>() {
    private lateinit var inflater: LayoutInflater
    private var title = arrayOf(
        "Chapter One",
        "Chapter Two",
        "Chapter Three",
        "Chapter Four",
        "Chapter Fiv",
        "Chapter Six",
        "Chapter Seven ",
        "Chapter Eight",
        "Chapter Nine",
        "Chapter Ten"
    )
    private var details = arrayOf(
        "Chapter One Details",
        "Chapter Two Details",
        "Chapter Three Details",
        "Chapter Four Details",
        "Chapter Five Details",
        "Chapter Six Details",
        "Chapter Seven Details",
        "Chapter Eight Details",
        "Chapter nine Details",
        "Chapter Tan Details"
    )
    private var images = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )

    inner class ViewHolder(val binding: CardLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.ViewHolder {
        inflater= LayoutInflater.from(parent.context)
        return ViewHolder(DataBindingUtil.inflate(inflater, R.layout.card_layout, parent, false))
    }

    override fun onBindViewHolder(holder: CardAdapter.ViewHolder, position: Int) {
        holder.binding.itemTitle.text = title[position]
        holder.binding.itemDetail.text = details[position]
        holder.binding.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size

    }


}