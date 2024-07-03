package ru.itis.summerpractice24

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import ru.itis.summerpractice24.databinding.ItemGroupBinding

class GroupAdapter(
    private val list: List<Group>,
    private val glide: RequestManager,
    private val onClick: (Group) -> Unit,

    ) : RecyclerView.Adapter<GroupHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupHolder = GroupHolder(
        binding = ItemGroupBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onClick = onClick,
    )



    override fun onBindViewHolder(holder: GroupHolder, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int = list.size


}