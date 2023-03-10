package com.example.expensemanager.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class CategoryLevel {
    Other
}

enum class TransactionType {
    Cash, DebitCard, CreditCard
}

@Entity(tableName = "transaction")
data class Transaction(
        @PrimaryKey(autoGenerate = true)
        val id: Long,
        val name: String,
        val amount: Float,

        @ColumnInfo(name = "date")
        val date: String,
        val fromDate: String,
        val toDate: String,
        val monthYear: Long,
        val month: Int,
        val year: Int,

        @ColumnInfo(name = "detail")
        val category: String,
        val type: Int,
        val comment: String,
        val plusMinus: Int
)