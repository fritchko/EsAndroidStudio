package com.example.esandroidstudio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.esandroidstudio.databinding.FragmentSecondActivityBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SecondActivityFragment : Fragment() {

    private var _binding: FragmentSecondActivityBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondActivityBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonMain.setOnClickListener {
            findNavController().navigate(R.id.action_SecondActivityFragment_to_FirstFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}