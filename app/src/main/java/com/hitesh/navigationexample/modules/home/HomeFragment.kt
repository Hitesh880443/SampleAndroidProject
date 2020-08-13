package com.hitesh.navigationexample.modules.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.hitesh.navigationexample.R
import com.hitesh.navigationexample.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.*
import org.koin.android.scope.lifecycleScope
import org.koin.android.scope.scope
import org.koin.android.viewmodel.ext.android.viewModel
import kotlin.coroutines.CoroutineContext

class HomeFragment : Fragment(), CoroutineScope {
    private val viewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding
    private var job: Job = Job()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        binding.executePendingBindings()

        setUpUI()
    }

    private fun setUpUI() {
        recyclerView_users.layoutManager = LinearLayoutManager(context)
        recyclerView_users.adapter = UserAdapter()
    }

    override fun onResume() {
        super.onResume()
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job
}