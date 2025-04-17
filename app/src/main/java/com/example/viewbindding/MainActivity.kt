package com.example.viewbindding

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbindding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked) {
                //open a new Screen
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.GREEN)

            }else{
                Toast.makeText(this,"please accept this T&C", Toast.LENGTH_SHORT).show()
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
            }
        }
    }
}