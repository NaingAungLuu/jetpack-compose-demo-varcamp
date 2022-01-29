package me.naingaungluu.jetpackcomposedemo.ui.screens.listViewDemo

import android.view.LayoutInflater
import android.view.ViewGroup
import me.naingaungluu.jetpackcomposedemo.base.BaseRecyclerAdapter
import me.naingaungluu.jetpackcomposedemo.base.BaseViewHolder
import me.naingaungluu.jetpackcomposedemo.databinding.ItemVerticalListBinding

class VerticalItemListAdapter: BaseRecyclerAdapter<String, VHVerticalListItem>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHVerticalListItem {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemVerticalListBinding.inflate(inflater, parent , false)
        return VHVerticalListItem(binding)
    }
}

class VHVerticalListItem(
    private val binding: ItemVerticalListBinding
) : BaseViewHolder<String>(binding.root) {
    override fun bind(data: String) {
        binding.tvArticleTitle.text = data
    }

}