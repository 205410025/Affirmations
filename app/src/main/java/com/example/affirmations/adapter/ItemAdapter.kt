package com.example.affirmations.adapter

//import Context, LayoutInflater, View, ViewGroup, TextView, RecyclerView, R , dan model Affirmation
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

//membuat class ItemAdaptor
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    //membuat nested class dengan nama ItemViewHolder
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    //onCreateViewHolder untuk membuat tampilan baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //onBindViewHolder untuk mengganti isi tampilan
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId)
    }

    //getItemcount digunakan nilai return dataset.size
    override fun getItemCount(): Int {
        return dataset.size
    }
}