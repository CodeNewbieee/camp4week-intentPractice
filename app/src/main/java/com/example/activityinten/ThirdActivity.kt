package com.example.activityinten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val strData = intent.getStringExtra("dataFromFirstActivity")
        val editText = findViewById<EditText>(R.id.editText)
        editText.setText(strData)

        val btn_close = findViewById<Button>(R.id.btn_close)
        btn_close.setOnClickListener {
            finish()
        }
    }
}