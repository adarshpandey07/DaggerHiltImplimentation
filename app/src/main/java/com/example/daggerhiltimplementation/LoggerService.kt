package com.example.daggerhiltimplementation

import android.util.Log
import javax.inject.Inject

//3 party apps
class LoggerService @Inject constructor() {
    fun log(message:String){
        Log.d(TAG,message)
    }
}