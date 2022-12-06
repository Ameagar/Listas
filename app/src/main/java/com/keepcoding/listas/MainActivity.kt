package com.keepcoding.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.keepcoding.listas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createRecycler()
    }

    private fun createRecycler(){
        binding.rvItems.adapter = MainAdapter()
        binding.rvItems.layoutManager = LinearLayoutManager(this)

    }
}