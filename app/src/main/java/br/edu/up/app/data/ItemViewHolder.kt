package br.edu.up.app.data

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.up.app.databinding.ItemRecyclerBinding

class ItemViewHolder(binding : ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {
    val title : TextView = binding.txtTitle
    val subTitle : TextView = binding.txtSubTitle
}