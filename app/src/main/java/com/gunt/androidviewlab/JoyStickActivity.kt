package com.gunt.androidviewlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gunt.androidviewlab.databinding.ActivityJoyStickBinding

class JoyStickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityJoyStickBinding>(this, R.layout.activity_joy_stick)
        setContentView(binding.root)
    }
}