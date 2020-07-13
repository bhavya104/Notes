package com.example.notes.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Note (
//    @ColumnInfo(name = "note_title")  if we want to give columns name then we can use this...
    val title: String,
    val note: String
):Serializable{
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}