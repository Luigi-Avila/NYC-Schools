package com.example.a20230317_luisavila_nycschools.mainScreen.data

import com.example.a20230317_luisavila_nycschools.mainScreen.data.models.SchoolsResponseItem
import com.example.a20230317_luisavila_nycschools.mainScreen.data.network.SchoolService

class SchoolRepository {

    private val api = SchoolService()

    suspend fun getSchools(): List<SchoolsResponseItem> {
        return api.getSchools()
    }
}