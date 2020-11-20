package com.example.projectforandroidacademy

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val recyclerAdapter = ActorsRecyclerAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_view_layout)
        recyclerAdapter.addActors(listOf(
                Pair(R.mipmap.picture1, "Robert Downey Jr."),
                Pair(R.mipmap.picture2, "Chris Evans"),
                Pair(R.mipmap.picture4, "Mark Ruffalo"),
                Pair(R.mipmap.picture3, "Chris Hemsworths")))
        findViewById<RecyclerView>(R.id.actors_recycler_view).apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = recyclerAdapter
        }

    }


}