package com.example.a20230317_luisavila_nycschools.mainScreen.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a20230317_luisavila_nycschools.R
import com.example.a20230317_luisavila_nycschools.mainScreen.data.models.SchoolsResponseItem

class SchoolViewHolder(val view: View): RecyclerView.ViewHolder(view) {

    val school = view.findViewById<TextView>(R.id.tvSchoolName)

    fun render(schoolModel: SchoolsResponseItem){
            school.text = schoolModel.school_name
    }
}