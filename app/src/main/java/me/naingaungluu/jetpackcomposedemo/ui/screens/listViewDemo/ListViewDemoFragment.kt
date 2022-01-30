package me.naingaungluu.jetpackcomposedemo.ui.screens.listViewDemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import me.naingaungluu.jetpackcomposedemo.databinding.FragmentListViewDemoBinding
import me.naingaungluu.jetpackcomposedemo.ui.themes.DemoAppTheme

class ListViewDemoFragment : Fragment() {

    private lateinit var binding : FragmentListViewDemoBinding

    private val horizontalListAdapter : HorizontalItemListAdapter by lazy { HorizontalItemListAdapter() }
    private val verticalListAdapter : VerticalItemListAdapter by lazy { VerticalItemListAdapter() }

    companion object {
        val dummyListItem = listOf(
            "Article 1",
            "Article 2",
            "Article 3",
            "Article 4",
            "Article 5",
            "Article 6"
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListViewDemoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
    }

    private fun setupUi() {
        setupHorizontalList()
        setupVerticalList()
    }

    private fun setupHorizontalList() {
        with(binding.rvHorizontalList) {
            adapter = horizontalListAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            horizontalListAdapter.update(dummyListItem.toMutableList())
        }
    }

    private fun setupVerticalList() {
        with(binding.rvVerticalList) {
            adapter = verticalListAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            verticalListAdapter.update(dummyListItem.toMutableList())
        }
    }

}