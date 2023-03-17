package com.example.cafeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val KEY = "com.example.cafeapp.MainActivity.KEY"
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btn.setOnClickListener {

            val orderPlaced =
                binding.editText1.text.toString() + " " + binding.editText2.text.toString()  +
                        " " + binding.editText3.text.toString()+" "

            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}