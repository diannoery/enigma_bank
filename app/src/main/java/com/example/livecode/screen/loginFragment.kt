package com.example.livecode.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.livecode.R
import kotlinx.android.synthetic.main.fragment_login.*


class loginFragment : Fragment() ,View.OnClickListener {
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        loginUser.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       when(v){
           loginUser->{
                navController.navigate(R.id.action_loginFragment_to_homeFragment)
           }
       }
    }


}