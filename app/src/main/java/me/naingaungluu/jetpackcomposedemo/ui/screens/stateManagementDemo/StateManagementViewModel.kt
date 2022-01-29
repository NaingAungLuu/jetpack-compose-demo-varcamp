package me.naingaungluu.jetpackcomposedemo.ui.screens.stateManagementDemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.max
import kotlin.math.min

class StateManagementViewModel : ViewModel() {

    private var currentValue = 0

    private val _currentValue : MutableLiveData<Int> = MutableLiveData(0)
    val currentValueLiveData : LiveData<Int> = _currentValue

    fun increaseValue() {
        currentValue = min(currentValue.plus(1) , Integer.MAX_VALUE)
        _currentValue.postValue(currentValue)
    }

    fun decreaseValue() {
        currentValue = max(currentValue.minus(1) , 0)
        _currentValue.postValue(currentValue)
    }

}