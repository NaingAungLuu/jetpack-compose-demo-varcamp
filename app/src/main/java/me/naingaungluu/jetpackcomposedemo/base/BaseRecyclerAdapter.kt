package me.naingaungluu.jetpackcomposedemo.base

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerAdapter<T,W : BaseViewHolder<T>> : RecyclerView.Adapter<W>(){

    protected var list: MutableList<T> = mutableListOf()

    init {
        list = ArrayList()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: W, position: Int) {
        holder.bind(list[position])
    }

    fun update(data : MutableList<T>) {
        list = data
        notifyDataSetChanged()
    }

}

abstract class BaseViewHolder<T>(itemView : View) : RecyclerView.ViewHolder(itemView) {
     abstract fun bind(data : T)
}