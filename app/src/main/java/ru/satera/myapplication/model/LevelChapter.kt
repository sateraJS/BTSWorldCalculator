package ru.satera.myapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "level_chapters")
data class LevelChapter(

    @PrimaryKey(autoGenerate = true)
    val id: Long,

    val nameChapter: Int,
    val nameLevel: Int,
    val empathy: Double,
    val passion: Double,
    val stamina: Double,
    val wisdom: Double,
    val oneStar: Int,
    val twoStar: Int,
    val threeStar: Int,
    val countCards: Int,
    val propertyFor1: Int,
    val propertyFor2: Int,
    val personFor1: String,
    val personFor2: String
)
