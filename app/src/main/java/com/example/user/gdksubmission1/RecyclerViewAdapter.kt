package com.example.user.gdksubmission1

import android.content.ClipData
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class RecyclerViewAdapter(private val context: Context, private val items: List<ClipData.Item>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val name = view.findViewById<TextView>(R.id.name)
        private val image = view.findViewById<ImageView>(R.id.image)

        fun bindItem(items: ClipData.Item) {
            name.text = items.name
            items.image?.let { Picasso.get().load(it).into(image) }
        }
    }
}

private fun Any.into(image: ImageView?): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun Picasso.load(it: Any): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private val Any.image: Any
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

private val Any.name: CharSequence?
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
