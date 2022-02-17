package com.example.project6.view_model

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.project6.model.Contoh
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MyViewModel @Inject constructor(
    private val classContoh: Contoh
) : ViewModel() {

    var a = 10

    fun incrementA() {
        a++
    }

//    val contoh = Contoh()
//    fun executeLogFromContoh() {
//        contoh.logHello()
//    }

    fun executeLogFromContoh() {
        classContoh.logHello()
        Log.i("test", "SomeString")
    }
}