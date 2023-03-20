package com.example.a20230317_luisavila_nycschools.mainScreen.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.a20230317_luisavila_nycschools.mainScreen.data.SchoolRepository
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainScreenViewModel(): ViewModel() {

    fun getSchools(){
        viewModelScope.launch {
            Log.i("VIEWMODEL", "GET schools run")
            SchoolRepository().getSchools()
        }
    }
}