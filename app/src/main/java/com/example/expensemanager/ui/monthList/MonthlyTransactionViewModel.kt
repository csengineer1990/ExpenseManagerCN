package com.example.expensemanager.ui.monthList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.expensemanager.data.MonthlyTransactions
import com.example.expensemanager.data.TransactionListRepository

class MonthlyTransactionViewModel(application: Application): AndroidViewModel(application) {

    private val repo: TransactionListRepository = TransactionListRepository(application)

    val month: LiveData<List<MonthlyTransactions>>
        get() = repo.getTransactionMonth()

}