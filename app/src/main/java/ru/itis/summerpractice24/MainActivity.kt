package ru.itis.summerpractice24

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button: Button = findViewById(R.id.buttonForRace)
        button.setOnClickListener {
            val editText: EditText = findViewById(R.id.editTextCarCount)
            val racesCounter = editText.text.toString().toInt()
            var listOfCars = mutableListOf<Car>();
            for (i in 0 until racesCounter) {
                val carBuilder = CarBuilder()
                var car = carBuilder.randomCarGenerate()
                listOfCars.add(car)
            }
            while (listOfCars.size > 1) {
                listOfCars.shuffle()
                val racesCount = listOfCars.size
                for (i in 0 until (racesCount) / 2) {
                    Log.d("ABRAKADABRA","Гонка между ${listOfCars[i].brand} и ${listOfCars[i + 1].brand} ")
                    if (listOfCars[i].compareTo(listOfCars[i + 1]) > 0) {
                        Log.d("ABRAKADABRA","Победитель ${listOfCars[i].brand}")
                        listOfCars.removeAt(i + 1)
                    } else {
                        Log.d("ABRAKADABRA","Победитель ${listOfCars[i + 1].brand}")
                        listOfCars.removeAt(i)
                    }
                }
            }
            Log.d("ABRAKADABRA","Победитель турнира ${listOfCars[0].brand}")
        }
    }
}