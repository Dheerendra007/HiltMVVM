package com.dk.hiltmvvm

import android.util.Log
import javax.inject.Inject

interface MessageService{
    fun sentMsg(userName:String, password:String){
        Log.d("StudentRepository","11 Name : $userName Password: $password")
    }
}
class SaveRoomDB @Inject constructor():MessageService {
    override fun sentMsg(userName: String, password: String) {
        Log.d("StudentRepository SaveRoomDB", "22 Name : $userName Password: $password")
    }
}

    class APIDB:MessageService {
        override fun sentMsg(userName:String, password:String){
            Log.d("StudentRepository APIDB","33 Name : $userName Password: $password")
        }
}