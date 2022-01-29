package me.naingaungluu.jetpackcomposedemo.ui.screens.listViewDemo

import android.view.LayoutInflater
import android.view.ViewGroup
import me.naingaungluu.jetpackcomposedemo.base.BaseRecyclerAdapter
import me.naingaungluu.jetpackcomposedemo.base.BaseViewHolder
import me.naingaungluu.jetpackcomposedemo.databinding.ItemHorizontalListBinding

class HorizontalItemListAdapter: BaseRecyclerAdapter<String, VHHorizontalListItem>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHHorizontalListItem {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHorizontalListBinding.inflate(inflater, parent , false)
        return VHHorizontalListItem(binding)
    }
}

class VHHorizontalListItem(
    private val binding: ItemHorizontalListBinding
) : BaseViewHolder<String>(binding.root) {
    override fun bind(data: String) {
        binding.tvArticleTitle.text = data
    }

}