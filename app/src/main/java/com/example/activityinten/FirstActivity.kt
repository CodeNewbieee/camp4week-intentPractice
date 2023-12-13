package com.example.activityinten

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btn = findViewById<Button>(R.id.btn1)
        //btn1의 아이디를 가져와 버튼에 대한 객체 생성
        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            // 객체의 기능중 셋온리스너를 사용하며, 인텐트 기능을 위해 다음 페이지를 부르고자 함
            // SecondActivity 페이지를 부르는 인텐트 객체 생성후
            // startActivity를 통해 호출
        }

        val btn_3 = findViewById<Button>(R.id.btn_third)
        btn_3.setOnClickListener {
            val edit_text = findViewById<EditText>(R.id.edit_data)
            val strData = edit_text.text.toString()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("dataFromFirstActivity", strData)
            startActivity(intent)
        }
    }
        fun doOnBtnClick(view: View) {
            //doOnBtnClick 함수를 생성 하며, first.xml에서 클릭되었을때 이 함수를 실행하도록 지정해놓음
            when(view.getId()) {
                // when 제어문을 통해 xml에 있는 view의 id를 호출하여 그에 해당하는 아이디 버튼일 경우
                // 각 기능을 수행하도록 함
                R.id.btn_dial -> {
                    val call_intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-7777-8888"))
                    startActivity(call_intent)
                }

                R.id.btn_map -> {
                    val map_intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.565350, 127.01445"))
                    startActivity(map_intent)
                }
            }
        }
}