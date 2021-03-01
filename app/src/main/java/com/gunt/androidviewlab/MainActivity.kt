package com.gunt.androidviewlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gunt.androidviewlab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        setContentView(binding.root)

        binding.btnJoystick.setOnClickListener {
            startActivity(Intent(this, JoyStickActivity::class.java))
        }

        binding.btnMotion.setOnClickListener {
            startActivity(Intent(this, MotionMoveActivity::class.java))
        }
    }
}