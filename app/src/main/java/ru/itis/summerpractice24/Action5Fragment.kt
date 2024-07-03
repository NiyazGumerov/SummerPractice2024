package ru.itis.summerpractice24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractice.DetailGroupFragment
import ru.itis.summerpractice24.databinding.FragmentAction5Binding

class Action5Fragment : Fragment(R.layout.fragment_action_5) {
    private var binding: FragmentAction5Binding? = null

    private var adapter: GroupAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAction5Binding.bind(view)
        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = GroupAdapter(
            list = DetailGroupRepository.convertListToGroup(DetailGroupRepository.groups.toList()),
            glide = Glide.with(this),
            onClick = {
                findNavController().navigate(
                    resId = R.id.action_fragment_action_5_to_detailGroupFragment,
                    args = DetailGroupFragment.bundle(id = it.id)
                )
            }
        )

        binding?.run {
            rvGroup.adapter = adapter
            rvGroup.layoutManager = LinearLayoutManager(requireContext())

        }


    }
}