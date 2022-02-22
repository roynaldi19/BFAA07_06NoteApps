package com.roynaldi19.bfaa07_06noteapps.helper

import androidx.recyclerview.widget.DiffUtil
import com.roynaldi19.bfaa07_06noteapps.database.Note

class NoteDiffCallback(private val oldNoteList: List<Note>, private val newNoteList: List<Note>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = oldNoteList.size

    override fun getNewListSize() = newNoteList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldNoteList[oldItemPosition].id == newNoteList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = oldNoteList[oldItemPosition]
        val newEmployee = newNoteList[oldItemPosition]
        return oldEmployee.title == newEmployee.title && oldEmployee.description == newEmployee.description
    }

}