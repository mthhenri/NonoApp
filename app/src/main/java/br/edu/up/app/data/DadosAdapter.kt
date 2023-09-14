package br.edu.up.app.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.edu.up.app.databinding.ItemRecyclerBinding

class DadosAdapter(val dados : List<Item>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRecyclerBinding.inflate(inflater, parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dados[position]
        holder.title.text = item.tittle
        holder.subTitle.text = item.subTittle
    }

    override fun getItemCount(): Int {
        return dados.size
    }

}