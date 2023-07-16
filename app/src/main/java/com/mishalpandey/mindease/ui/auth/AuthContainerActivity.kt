package com.mishalpandey.mindease.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.mishalpandey.mindease.R
import com.mishalpandey.mindease.databinding.ActivityAuthContainerBinding


class AuthContainerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}