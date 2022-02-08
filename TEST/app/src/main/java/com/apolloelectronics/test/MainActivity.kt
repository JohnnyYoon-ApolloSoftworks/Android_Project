package com.apolloelectronics.test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.apolloelectronics.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val tag : String = "MainActivity"

    private var toggleState : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d(tag, "onCreate")

        binding.btnPrint.setOnClickListener {
            toggleState = !toggleState

            if (toggleState) {
                binding.textView.text = getString(R.string.helloWorld)
            } else {
                binding.textView.text = getString(R.string.helloKotlin)
            }

            Log.d(tag, "Button is Clicked!")
        }
    }
}
