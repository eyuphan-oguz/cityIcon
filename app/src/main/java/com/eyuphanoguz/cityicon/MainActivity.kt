package com.eyuphanoguz.cityicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eyuphanoguz.cityicon.databinding.ActivityDetailBinding
import com.eyuphanoguz.cityicon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val landmarkPisa : Landmark = Landmark("Italy","Pisa",R.drawable.pisa)
        val landmarkEiffel : Landmark = Landmark("France","Eiffel",R.drawable.eiffel)
        val landmarkLondonBridge : Landmark = Landmark("London","London Bridge",R.drawable.londonBridge)
        val landmarkColosseum : Landmark = Landmark("Italy","Colosseum",R.drawable.colosseum)

        val myList = ArrayList<Landmark>()

        myList.add(landmarkPisa)
        myList.add(landmarkEiffel)
        myList.add(landmarkLondonBridge)
        myList.add(landmarkColosseum)



    }
}