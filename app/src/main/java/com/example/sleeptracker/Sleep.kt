package com.example.sleeptracker
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sleep")

class Sleep(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val startDate: Long,
    val endDate: Long,
    val quality: Int
)