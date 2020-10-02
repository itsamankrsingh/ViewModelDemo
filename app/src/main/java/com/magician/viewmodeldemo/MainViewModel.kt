package com.magician.viewmodeldemo

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startingTotal: Int) : ViewModel(), Observable {

    private var num = MutableLiveData<Int>()
    val totalSum: LiveData<Int>
        get() = num

    @Bindable
    var inputText = MutableLiveData<String>()

    init {
        num.value = startingTotal
    }

    fun add() {
        val number = inputText.value!!.toInt()
        num.value = (num.value)?.plus(number)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {}


}