package com.practice6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import com.practice6.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intentUserData = intent.getParcelableExtra<User>("userData")
        intentUserData?.let{
         binding.textView.text = "$it $intentUserData"
        }
        binding.button2.setOnClickListener {
            val data = binding.textView.text.toString().split(" ")
            val userData = User(data[0])
            startActivity(Intent(this,MainActivity3::class.java).apply {
                putExtra("userData", userData)
            })
        }
    }
}