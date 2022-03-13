package com.example.dzfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import com.example.dzfirstapp.databinding.ActivityHelloBinding

class HelloActivity : AppCompatActivity() {
    lateinit var binding: ActivityHelloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)
        binding.viewTxt.text = message
    }
}