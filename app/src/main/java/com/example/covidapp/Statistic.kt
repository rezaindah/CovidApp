package com.example.covidapp

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covidapp.network.data.Country
import kotlinx.android.synthetic.main.activity_statistic.*
import kotlinx.android.synthetic.main.frag_home.recyclerview

class Statistic : AppCompatActivity() {

    var mProgressBar: ProgressBar? = null

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistic)

        recyclerview.setHasFixedSize(true)
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        mProgressBar = progressBar
        progressBar.visibility = View.VISIBLE

        val data = Observer<Country> {
            recyclerview.adapter = ModelListAdapter(it.Countries)
            progressBar.visibility = View.GONE
        }

        viewModel.callAPI().observe(this,data)

    }
}
