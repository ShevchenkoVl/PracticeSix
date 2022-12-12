package com.practice6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.practice6.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val data = binding.editTextTextPersonName.text.toString().split(" ")
            val userData = User(data[0])
            startActivity(Intent(this,MainActivity2::class.java).apply {
                putExtra("userData", userData)
            })
        }
    }
}