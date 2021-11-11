package com.example.teamscorehw

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelMain : ViewModel() {

    private val _score = MutableLiveData(0)
    val score: LiveData <Int>
        get() = _score

    // add one to the _score
    fun addOne() {
        _score.value = _score.value?.plus(1)
    }

    // add four to the score
    fun addFour() {
        _score.value = _score.value?.plus(4)
    }

    // subtract two from _score
    fun subTwo() {
        if (_score.value!! >= 2)    _score.value = _score.value?.minus(2)

    }

}