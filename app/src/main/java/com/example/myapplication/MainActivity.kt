package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun calculate (){
            var textField = binding.txtname.text
            Toast.makeText(this,textField, Toast.LENGTH_SHORT).show();
        }

        binding.btnShow.setOnClickListener(){
            calculate()
        }

        fun test(){
            
        }
    }
}