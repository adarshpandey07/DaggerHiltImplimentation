package com.example.daggerhiltimplementation


import android.util.Log
import javax.inject.Inject

const val TAG = "ADARSHPANDEY"

interface UserRepository {
    fun saveUser(email: String, password: String)

}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "USER SAVED IN DB")

    }
}
class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "USER SAVED IN FIREBASE")
    }

}

