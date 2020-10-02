package com.magician.viewmodeldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startingTotal: Int) : ViewModel() {

    private var num = MutableLiveData<Int>()
    val totalSum: LiveData<Int>
    get() = num


    init {
        num.value = startingTotal
    }

    fun add(number: Int) {
        num.value = (num.value)?.plus(number)
    }


}