package ru.itis.summerpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import ru.itis.summerpractice24.DetailGroupRepository
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.DetailGroupBinding

class DetailGroupFragment : Fragment(R.layout.detail_group){
    private var binding : DetailGroupBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DetailGroupBinding.bind(view)

        val detailGroup = DetailGroupRepository.groups.find {
            it.id == (arguments?.getInt(ARG_ID) ?: -1)
        }


        binding?.run {
            buttonBack.setOnClickListener{
                findNavController().navigate(
                    resId = R.id.action_detailGroupFragment_to_fragment_action_5
                )
            }
            if (detailGroup != null){
                tvAbout.text = detailGroup.information
                Glide.with(ivImage.context)
                    .load(detailGroup.url)
                    .into(ivImage)
            }
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding =  null
    }
    companion object {

        private const val ARG_ID = "ARG_AD"

        fun bundle(id : Int): Bundle = Bundle().apply {
            putInt(ARG_ID, id)

        }
    }
}