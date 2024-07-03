package ru.itis.summerpractice24

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import ru.itis.summerpractice24.databinding.ItemGroupBinding


class GroupHolder(
    private val binding: ItemGroupBinding,
    private val glide: RequestManager,
    private val onClick: (Group) -> Unit,
) : ViewHolder(binding.root) {

    fun onBind(group: Group) {
        binding.run {
            tvGroup.text = group.name
            tvStyle.text = group.style

            glide
                .load(group.url)
                .error(R.drawable.image_error_full)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(ivImage)

            root.setOnClickListener {
                onClick.invoke(group)

            }
        }
    }
}