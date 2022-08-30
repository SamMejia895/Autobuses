package com.eclipse.spacetours.autobuses


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.eclipse.spacetours.autobuses.databinding.FragmentFirstBinding


private lateinit var safeContext: Context
private var TAG = "FirstFragment"



class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onAttach(context: Context) {
        super.onAttach(context)
        safeContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*activity?.onBackPressedDispatcher?.addCallback(
            viewLifecycleOwner,
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    Log.d(TAG, "paso por el backpress")
                    findNavController().navigate(R.id.action_resultadoPedidosFragment_to_detallePedidosFragment)
                }
            })*/

        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCerrarPedido.setOnClickListener {
            Log.d(TAG, "btnCerrarPedido")
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}

