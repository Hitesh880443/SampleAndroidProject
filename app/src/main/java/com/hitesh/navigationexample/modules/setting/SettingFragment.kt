package com.hitesh.navigationexample.modules.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.hitesh.navigationexample.R
import com.hitesh.navigationexample.databinding.FragmentSettingBinding
import org.koin.android.viewmodel.ext.android.viewModel

class SettingFragment : Fragment() {
    private val viewModel: SettingViewModel by viewModel()
    private lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentSettingBinding>(
            inflater,
            R.layout.fragment_setting,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel
        binding.executePendingBindings()
    }

    companion object {
        @JvmStatic
        fun newInstance() = SettingFragment()
    }
}