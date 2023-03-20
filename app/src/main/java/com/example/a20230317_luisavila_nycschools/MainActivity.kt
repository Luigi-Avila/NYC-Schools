package com.example.a20230317_luisavila_nycschools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20230317_luisavila_nycschools.mainScreen.ui.MainScreenViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainScreenViewModel().getSchools()
        setContentView(R.layout.activity_main)
    }
}