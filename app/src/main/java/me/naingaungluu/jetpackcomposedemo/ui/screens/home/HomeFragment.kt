package me.naingaungluu.jetpackcomposedemo.ui.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import me.naingaungluu.jetpackcomposedemo.ui.themes.DemoAppTheme

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                DemoAppTheme {
                    HomeScreen { navigateToMenu(it) }
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
    }

    private fun navigateToMenu(menu : MenuAction){
        val action = when(menu) {
            MenuAction.InteroperabilityDemo -> HomeFragmentDirections.actionHomeFragmentToInteroperabilityDemoFragment()
            MenuAction.StateManagementDemo -> HomeFragmentDirections.actionHomeFragmentToStateManagementDemoFragment()
            MenuAction.ListViewDemo -> HomeFragmentDirections.actionHomeFragmentToListViewDemoFragment()
        }
        findNavController().navigate(action)
    }

    private fun setupUi() {}

}