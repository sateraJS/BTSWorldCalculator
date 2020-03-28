package ru.satera.myapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cards")
data class Card(

    @PrimaryKey(autoGenerate = true)
    val id: Long,

    val level: Int,
    val name: String,
    val empathy: Int,
    val passion: Int,
    val stamina: Int,
    val wisdom: Int,
    val orientation: Int
)