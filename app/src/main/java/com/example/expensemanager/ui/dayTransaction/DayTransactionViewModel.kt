package com.example.expensemanager.ui.dayTransaction

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.expensemanager.data.Transaction
import com.example.expensemanager.data.TransactionListRepository

class DayTransactionViewModel(application: Application) : AndroidViewModel(application) {
    private val repo: TransactionListRepository = TransactionListRepository(application)

    private val _date = MutableLiveData<String>()

    val dayTransaction: LiveData<List<Transaction>> = Transformations.switchMap(_date) { id ->
        repo.getTransactionByDate(id)
    }

    fun setDate(date: String) {
        _date.value = date
    }
}