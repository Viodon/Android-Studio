package com.example.animals

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val imageView: ImageView = findViewById(R.id.imageView)
        val txtName: TextView = findViewById(R.id.txtName) //
        val txtDescription: TextView = findViewById(R.id.txtDescription)

        val receivedData = intent.getSerializableExtra("animalData") as? AnimalData

        receivedData?.let {
            imageView.setImageResource(it.imageResId)
            txtName.text = it.name
            txtDescription.text = it.description
        }

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

    }
}
