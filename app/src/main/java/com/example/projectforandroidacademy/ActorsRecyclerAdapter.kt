package com.example.projectforandroidacademy

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.time.seconds

class ActorsRecyclerAdapter(private val context: Context) : RecyclerView.Adapter<ActorsRecyclerAdapter.ActorViewHolder>() {

    private val actors = ArrayList<Pair<Int, String>>()

    inner class ActorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val picture: ImageView = view.findViewById(R.id.photo_image_view)
        val name: TextView = view.findViewById(R.id.name_text_view);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.actors_recycler_item, parent, false)
        return ActorViewHolder(view)
    }

    override fun getItemCount() = actors.size

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.picture.setImageResource(actors[position].first)
        holder.name.text = actors[position].second
    }

    fun addActors(actors: List<Pair<Int, String>>) {
        this.actors.addAll(actors)
    }
}