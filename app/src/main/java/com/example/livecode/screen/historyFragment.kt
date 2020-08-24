package com.example.livecode.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.livecode.R
import com.example.livecode.recycleviewadapter.BankAdabterReceycleView
import com.example.livecode.viewmodel.BankViewModel
import kotlinx.android.synthetic.main.fragment_history.*

class historyFragment : Fragment(),View.OnClickListener {

    val historyViewModel by activityViewModels<BankViewModel>()
    lateinit var bankRecycleView: BankAdabterReceycleView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        historyRecycle.layoutManager = LinearLayoutManager(activity)
        historyViewModel.allTransaction.observe(viewLifecycleOwner, Observer {
            bankRecycleView = BankAdabterReceycleView(it)
            historyRecycle.adapter = bankRecycleView
        })
        historyViewModel.getAllTransaction()
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}