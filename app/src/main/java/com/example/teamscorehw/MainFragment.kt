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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        updateScoreTextView()
        binding?.buttonAdd1?.setOnClickListener {
            viewModel.addOne()
            updateScoreTextView()

        }
        binding?.buttonAdd4?.setOnClickListener {
            viewModel.addFour()
            updateScoreTextView()

        }
        binding?.buttonSub2?.setOnClickListener {
            viewModel.subTwo()
            updateScoreTextView()

        }

    }

    private fun updateScoreTextView() {
        binding?.textViewDisplay?.text = viewModel.score.toString()

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}