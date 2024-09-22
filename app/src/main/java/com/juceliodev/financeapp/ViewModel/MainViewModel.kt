package com.juceliodev.financeapp.ViewModel

import androidx.lifecycle.ViewModel
import com.juceliodev.financeapp.Respository.MainRepository

class MainViewModel(val repository: MainRepository):ViewModel() {
    constructor():this(MainRepository())

    fun loadData( )=repository.items
    fun loadBudget()=repository.budget
}