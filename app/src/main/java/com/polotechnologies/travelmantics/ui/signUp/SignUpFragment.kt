package com.polotechnologies.travelmantics.ui.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.polotechnologies.travelmantics.R
import com.polotechnologies.travelmantics.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    lateinit var mBinding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false)

        setOnClickListeners()
        return mBinding.root
    }

    private fun setOnClickListeners() {
        mBinding.btnSignUp.setOnClickListener {
            Toast.makeText(context, "Signing up ......", Toast.LENGTH_SHORT).show()
        }

        mBinding.btnSignUpLogin.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
        }
    }

}
