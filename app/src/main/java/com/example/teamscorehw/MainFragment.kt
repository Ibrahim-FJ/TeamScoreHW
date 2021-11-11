package com.example.teamscorehw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teamscorehw.databinding.FragmentMainBinding
import androidx.fragment.app.viewModels


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding
    private val viewModel: ViewModelMain by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonAdd1?.setOnClickListener {
            viewModel.addOne()

        }
        binding?.buttonAdd4?.setOnClickListener {
            viewModel.addFour()


        }
        binding?.buttonSub2?.setOnClickListener {
            viewModel.subTwo()

        }
        updateScoreTextView()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    /**
     * function to update the TextView with new score
     *
     */
    private fun updateScoreTextView() {
        viewModel.score.observe(viewLifecycleOwner, { binding?.textViewDisplay?.text = it.toString() })


    }
}