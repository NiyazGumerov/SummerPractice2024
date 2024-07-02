package ru.itis.summerpractice24

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class Action1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.fragment_action_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            val button: Button = view.findViewById(R.id.button)
            button.setOnClickListener{
                val editText: EditText = view.findViewById(R.id.editTextMessage)
                if (editText.text.toString() == ""){
                    Snackbar.make(view.findViewById(R.id.fragment_action_1),"Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT)
                        .show()
                } else {
                    val action =
                        Action1FragmentDirections.action1ToSixthFragment(editText.text.toString())
                    findNavController().navigate(action)
                }

        }
    }


}