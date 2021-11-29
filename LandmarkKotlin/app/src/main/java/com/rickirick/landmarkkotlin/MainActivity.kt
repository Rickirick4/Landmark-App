package com.rickirick.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rickirick.landmarkkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //Data

        val pisa = Landmark("Pisa", "Italy", R.drawable.a)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.b)
        val londonBridge = Landmark("Landon Bridge", "UK", R.drawable.c)
        val eiffel = Landmark("Eiffel", "French", R.drawable.d)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(londonBridge)
        landmarkList.add(eiffel)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

    }

}