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
        binding = ActivityOrderBinding.inflate(layoutInflater)

        val orderOfCustumer = intent.getStringExtra(MainActivity.KEY)
        binding.textView3.text ="Order Placed:\n"+ orderOfCustumer.toString()
        setContentView(binding.root)
    }
}