package com.example.a20230317_luisavila_nycschools.mainScreen.data.network

import android.util.Log
import com.example.a20230317_luisavila_nycschools.core.RetrofitHelper
import com.example.a20230317_luisavila_nycschools.mainScreen.data.models.SchoolsResponseItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SchoolService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getSchools(): List<SchoolsResponseItem>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(SchoolClient::class.java).getSchools()
            Log.i("Response", "${response.body()}")
            response.body()?: emptyList()
        }
    }
}