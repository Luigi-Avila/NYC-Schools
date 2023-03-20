package com.example.a20230317_luisavila_nycschools.mainScreen.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.a20230317_luisavila_nycschools.mainScreen.data.SchoolRepository
import androidx.lifecycle.viewModelScope
import com.example.a20230317_luisavila_nycschools.mainScreen.data.models.SchoolsResponseItem
import kotlinx.coroutines.launch

class MainScreenViewModel(): ViewModel() {

    private val _schoolList = MutableLiveData<List<SchoolsResponseItem>>()
    val schoolList: LiveData<List<SchoolsResponseItem>> = _schoolList
    fun getSchools(){
        viewModelScope.launch {
            Log.i("VIEWMODEL", "Get schools run")
           _schoolList.value = SchoolRepository().getSchools()
            Log.i("ViewMdel", "Valor de list ${_schoolList.value}")
        }
    }
}