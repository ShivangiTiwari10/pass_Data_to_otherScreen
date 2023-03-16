package com.example.cafeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeapp.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityOrderBinding.inflate(layoutInflater)

        val bundle = intent.extras
        if (bundle != null){
            binding.textView3.text = "Weg = ${bundle.getString("Veg")}"
            binding.textView4.text = "NonVeg = ${bundle.getString("nonVeg")}"
            binding.text5.text = "Sweet = ${bundle.getString("Sweet")}"
        }

        setContentView(binding.root)
    }
}