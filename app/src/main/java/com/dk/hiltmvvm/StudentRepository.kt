package com.dk.hiltmvvm

import android.util.Log
import javax.inject.Inject

class StudentRepository @Inject constructor(val messageService: MessageService) {
    fun studentLogin(userName:String, password:String){
       messageService.sentMsg(userName,password)
    }
}