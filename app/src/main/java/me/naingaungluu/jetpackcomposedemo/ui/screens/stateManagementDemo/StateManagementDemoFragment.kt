package me.naingaungluu.jetpackcomposedemo.ui.screens.stateManagementDemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import me.naingaungluu.jetpackcomposedemo.ui.themes.DemoAppTheme

class StateManagementDemoFragment : Fragment() {

    private val viewModel: StateManagementViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                DemoAppTheme {
                    StateManagementDemoScreen(
                        viewModel.currentValueLiveData,
                        onTapAdd = viewModel::increaseValue,
                        onTapSubtract = viewModel::decreaseValue
                    )
                }
            }
        }
    }
}