package com.aminlimbada.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Burgers","Pizza","Indian","KFC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList.get(randomFood)
        }

        addFoodBtn.setOnClickListener{


            val newFood = addFoodText.text.toString()
            if(newFood != ""){
                foodList.add(newFood)
                addFoodText.text.clear()

                val text = "Food item added successfully!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()

            } else {
                val text = "Food item is empty!"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }



        }
    }
}
