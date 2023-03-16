package com.example.cafeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

          binding.btn.setOnClickListener {
              val bundle = Bundle()
              bundle.putString("Veg",binding.editText1.text.toString())
              bundle.putString("nonVeg",binding.editText2.text.toString())
              bundle.putString("Sweet",binding.editText3.text.toString())

              val intent = Intent(this,OrderActivity::class.java)
              intent.putExtras(bundle)
              startActivity(intent)
          }
        setContentView(binding.root)
    }
}