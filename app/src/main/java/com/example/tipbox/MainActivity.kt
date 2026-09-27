package com.example.tipBox

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.R

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.isVisible

import com.example.tipBox.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.yuvarlaid.setOnClickListener {
            if (binding.meblegid.text.isNotEmpty()) {
                var secim = binding.radioGroup.checkedRadioButtonId
                var faiz = 0.0

                when (secim) {
                    binding.radioButton1.id -> faiz = 0.2
                    binding.radioButton2.id -> faiz = 0.15
                    binding.radioButton3.id ->faiz= 0.1
                }
                var sonuc = binding.meblegid.text.toString()
                var bexsis = sonuc.toDouble() * faiz
                if (binding.yuvarlkaid.isChecked) {
                    bexsis = kotlin.math.ceil(bexsis)
                }
                binding.sonid.text = bexsis.toString()


            }
        }
    }

}
