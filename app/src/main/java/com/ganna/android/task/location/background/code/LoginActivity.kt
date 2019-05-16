package com.ganna.android.task.location.background.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ganna.task.location.background.code.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


    fun navToMain(view:View){
        startActivity(Intent(this, MainActivity::class.java))
    }
}
