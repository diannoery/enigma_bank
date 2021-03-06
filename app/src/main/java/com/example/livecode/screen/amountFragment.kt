package com.example.livecode.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.livecode.R
import com.example.livecode.viewmodel.BankViewModel
import kotlinx.android.synthetic.main.fragment_amount.*


class amountFragment : Fragment(),View.OnClickListener {
    lateinit var navController: NavController
    val historyViewModel by activityViewModels<BankViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        doneTranscation.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            doneTranscation->{


                navController.navigate(R.id.action_amountFragment_to_amountDoneFragment)
            }
        }
    }


}