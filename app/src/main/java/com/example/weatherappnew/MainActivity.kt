package com.example.weatherappnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weatherappnew.databinding.ActivityMainBinding
import com.example.weatherappnew.fragments.MainFragment
import org.json.JSONObject
import java.lang.reflect.Method

const val API_KEY = "edc4099f7c6a4e09848142109230804&q"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(
            R.id.placeHolder,
            MainFragment.newInstance()
        ).commit()

    }




}