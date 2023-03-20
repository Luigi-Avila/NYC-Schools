package com.example.a20230317_luisavila_nycschools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.activity.viewModels
import com.example.a20230317_luisavila_nycschools.mainScreen.ui.MainScreenViewModel
import com.example.a20230317_luisavila_nycschools.mainScreen.ui.SchoolAdapter

class MainActivity : AppCompatActivity() {

    private val viewModel: MainScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView(){
        viewModel.getSchools()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSchools)
        viewModel.schoolList.observe(this) { list ->
            recyclerView.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = SchoolAdapter(list)
            }
        }


        //recyclerView.adapter = SchoolAdapter(list)
    }
}