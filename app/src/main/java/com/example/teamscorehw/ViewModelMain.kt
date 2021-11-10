package com.example.teamscorehw

import androidx.lifecycle.ViewModel

class ViewModelMain : ViewModel() {
    private var _score = 0
    val score get() = _score

    fun addOne() {
        _score += 1
    }

    fun addFour() {
        _score += 4
    }

    fun subTwo() {
        if (_score >= 2) _score -= 2
    }

}