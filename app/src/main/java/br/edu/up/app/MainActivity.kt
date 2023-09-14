package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.edu.up.app.data.DadosAdapter
import br.edu.up.app.data.Item
import br.edu.up.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dados = mutableListOf<Item>()
        for(i in 1 .. 100){
            dados.add(Item("Item $i", "SubItem $i"))
        }

        binding.list.adapter = DadosAdapter(dados)

    }
}