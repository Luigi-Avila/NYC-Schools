package com.example.a20230317_luisavila_nycschools.mainScreen.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a20230317_luisavila_nycschools.R
import com.example.a20230317_luisavila_nycschools.mainScreen.data.models.SchoolsResponseItem

class SchoolAdapter( private val schoolList: List<SchoolsResponseItem>) : RecyclerView.Adapter<SchoolViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SchoolViewHolder(layoutInflater.inflate(R.layout.item_school, parent, false))
    }

    override fun onBindViewHolder(holder: SchoolViewHolder, position: Int) {
        val item = schoolList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = schoolList.size

}