package com.cs4520.brainflex.dao

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(
    tableName = "users"
)
data class UserEntity(
    @PrimaryKey val username: String,
    val insertedAt: LocalDateTime = LocalDateTime.now()
)