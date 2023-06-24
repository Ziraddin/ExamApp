package com.zireddinismayilov.examapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zireddinismayilov.examapp.databinding.ActivityDoctorDetailsBinding

class DoctorDetails : AppCompatActivity() {
    lateinit var binding: ActivityDoctorDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDoctorDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this@DoctorDetails, MainActivity::class.java))
        }
    }
}