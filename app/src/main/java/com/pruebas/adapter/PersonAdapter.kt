package com.pruebas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pruebas.R
import com.pruebas.models.Person

class PersonAdapter(
    private val dataset: ArrayList<Person>,
    val context: Context

) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    private lateinit var mlistener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        mlistener = listener
    }

    class ViewHolder(view: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(view) {

        val iv_image: ImageView
        val iv_textview: TextView

        // R resourses -> Accesos a las carpetas RES
        init {
            iv_image = view.findViewById(R.id.iv_image)
            iv_textview = view.findViewById(R.id.iv_textview)

            //Control de eventos
            view.setOnClickListener { listener.onItemClick(bindingAdapterPosition) }
        }


    }

    //AttachToRoot ¿QUE PUTAS ES?

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_line_perfilpersona, parent, false)
        return ViewHolder(view, mlistener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.iv_textview.text = dataset[position].nombre
    }

    override fun getItemCount(): Int = dataset.size

}




