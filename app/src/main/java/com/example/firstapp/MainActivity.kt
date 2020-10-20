package com.example.firstapp
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.firstapp.domain.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_Login.setOnClickListener{
            var status = if(!text_email.text.toString().equals("")
                    &&!text_password.text.toString().equals("")) "Login in process..." else "Login failed"
            if(status.equals("Login in process..."))verifyUser()
            Toast.makeText(this,status, Toast.LENGTH_SHORT).show()
        }
    }
    fun verifyUser(){
        val email=text_email.text.toString()
        val pass=text_password.text.toString()
        val u = User("",email,pass)

    }

}