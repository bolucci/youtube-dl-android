package com.youtubedl.ui.main.progress

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.youtubedl.databinding.FragmentProgressBinding
import com.youtubedl.di.ActivityScoped
import com.youtubedl.ui.main.base.BaseFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 12/7/18.
 */

@ActivityScoped
class ProgressFragment @Inject constructor() : BaseFragment() {

    companion object {
        fun newInstance() = ProgressFragment()
    }

    private lateinit var dataBinding: FragmentProgressBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = FragmentProgressBinding.inflate(inflater, container, false).apply {
            //            viewModel = (activity as TaskActivity).taskViewModel
        }

        return dataBinding.root
    }

}