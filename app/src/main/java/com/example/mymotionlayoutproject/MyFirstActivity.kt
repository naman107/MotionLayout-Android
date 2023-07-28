package com.example.mymotionlayoutproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymotionlayoutproject.databinding.ActivityMyFirstBinding

class MyFirstActivity : AppCompatActivity() {

    lateinit var binding: ActivityMyFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}