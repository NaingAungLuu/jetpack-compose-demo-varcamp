package me.naingaungluu.jetpackcomposedemo.ui.screens.interopDemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import me.naingaungluu.jetpackcomposedemo.R
import me.naingaungluu.jetpackcomposedemo.databinding.FragmentInteropDemoBinding

class InteroperabilityDemoFragment: Fragment() {

    private lateinit var binding : FragmentInteropDemoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInteropDemoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        binding.btnShowWebView.setOnClickListener {
            findNavController().navigate(InteroperabilityDemoFragmentDirections.actionInteroperabilityDemoFragmentToWebViewFragment())
        }
    }


}