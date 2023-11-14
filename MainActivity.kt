package com.example.animals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.animals.DetailsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAnimal1: Button = findViewById(R.id.btnAnimal1)
        val btnAnimal3: Button = findViewById(R.id.btnAnimal3)
        val btnAnimal2: Button = findViewById(R.id.btnAnimal)

        val animalData = AnimalData("Cat", "A small domesticated carnivorous mammal", R.drawable.cat)
        val animalData1 = AnimalData("Dog", "A dog is man's friend", R.drawable.dog)
        val animalData2 = AnimalData("Student", "May not sleep at all", R.drawable.student)

        btnAnimal1.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("animalData", animalData)
            startActivity(intent)
        }

        btnAnimal3.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("animalData", animalData1)
            startActivity(intent)
        }

        btnAnimal2.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("animalData", animalData2)
            startActivity(intent)
        }

    }
}
