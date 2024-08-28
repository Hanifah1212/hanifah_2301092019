package com.Hanifah.mobilekotlin_mi2b

import android.os.Bundle

import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)




        usernameInput = findViewById(R.id.username)
        passwordInput = findViewById(R.id.password)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username == "hanifah" && password == "1212") {

                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            } else {
                // Tampilkan pesan error jika login gagal
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }


        }
    }
}