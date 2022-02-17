package com.example.project6.ui.main.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.project6.R
import com.example.project6.databinding.FragmentSecondFraagmentBinding
import com.example.project6.databinding.FragmentThirdBinding
import com.example.project6.view_model.MyViewModel

class thirdFragment : Fragment() {

    private var binding: FragmentThirdBinding?= null
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.apply {
            viewModel.apply {
                Log.i("Current Value", "$a")
                btnNextt.setOnClickListener {
                    incrementA()
                    Log.i("Current Value", "$a")
                    findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}