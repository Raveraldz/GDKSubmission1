package com.example.user.gdksubmission1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textHello = findViewById<TextView>(R.id.text_hello)
        textHello.text = "Hello Kotlin!"

        data class Item (val name: String?, val image: Int?)

        private var items: MutableList<Item> = mutableListOf()
    }
}
