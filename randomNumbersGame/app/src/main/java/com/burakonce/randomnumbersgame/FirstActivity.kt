package com.burakonce.randomnumbersgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
    }

    fun play(view : View){

        val isim=editText.text.toString()

        val intent = Intent(applicationContext,MainActivity::class.java)

        intent.putExtra("isimGirdisi",isim)

        startActivity(intent)

    }
}