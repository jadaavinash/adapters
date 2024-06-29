package com.example.adapter

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var listView : ListView = findViewById(R.id.listView)


        val countries = arrayOf(
            "india",
            "england",
            "australia"
        )

        val arrayAdapter: ArrayAdapter<*>

        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            countries
        )

        listView.adapter = arrayAdapter
    }
}