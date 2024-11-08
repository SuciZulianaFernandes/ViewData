package id.ac.polbeng.sucizulianaf.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.polbeng.sucizulianaf.viewdata.BuahAdapter
import id.ac.polbeng.sucizulianaf.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding

    // Deklarasi data
    private val dataBuah = arrayOf("Alpukat", "Durian", "Jambu Air", "Manggis", "Strawberry")
    private val dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi adapter

        val adapter = BuahAdapter(this, dataBuah, dataGambar)
        val layoutManager = LinearLayoutManager(applicationContext)

        // Set adapter dan layout manager ke RecyclerView
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}