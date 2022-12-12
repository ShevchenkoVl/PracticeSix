package com.practice6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import com.practice6.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intentUserData = intent.getParcelableExtra<User>("userData")
        intentUserData?.let{
        binding.textView3.text = "$it $intentUserData"

        }
        binding.button3.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}