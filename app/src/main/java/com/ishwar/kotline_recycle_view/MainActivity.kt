package com.ishwar.kotline_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ishwar.kotline_recycle_view.adapter.CardAdapter
import com.ishwar.kotline_recycle_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter: RecyclerView.Adapter<CardAdapter.ViewHolder>?=null
    private var layoutManager: RecyclerView.LayoutManager? =null



    //    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        layoutManager=LinearLayoutManager(this)
        binding.recycleView.layoutManager=layoutManager
        adapter=CardAdapter()
        binding.recycleView.adapter=adapter


    }
}