package com.example.covidapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/symptoms.html"))
            startActivity(i)
        }
        b3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gov.pl/web/koronawirus/kolejne-kroki"))
            startActivity(i)
        }
        b4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/news/coronavirus"))
            startActivity(i)
        }
        b5.setOnClickListener {
            val intent = Intent(this, Statistic::class.java)
            startActivity(intent)
        }

    }
}
