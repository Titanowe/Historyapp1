package com.example.historyapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.InputDeviceCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput:EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialise

        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            //create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 18..50) {


                //when age is 30 display Thabiso else when is .. and so on continues
                val historicalPerson = when (age) {
                    30 -> "Alexander The Great " +
                            "created one of the largest empires in history , spending from Greece to northwest india"

                    35 -> "Mahatma Gandhi" +
                            "A world know hero who is idolised known as a great monk "

                    26-> "Albert Einstein" +
                            "Published his theory of relativity that changed the field in physics "

                    40 -> "Julius Caesar" +
                            "Forged the first Triumvirate with Pompey The Great and other rich people in Rome  "

                    22 -> "Aristotle"+" The ancient Greek philosopher whose ideas have profoundly influenced Western thought"

                    25->"Abraham Lincoln" + "The 16th President of the United States, remembered for leading the country during the Civil War and abolishing slavery"

                    44 ->"Napoleon Bonaparte"+ "The French military leader and emperor who reshaped Europe’s political landscape"

                    34 ->"Adolf Hitler"+"The dictator responsible for World War II and the Holocaust of the Jews "


                    47-> "Martin Luther King Jr "+" A civil rights leader who advocated for racial equality"

                    18 -> "Isaac Newton" +
                            "He had an IQ of roughly 170-190 and said to be the farther of Physics "

                    28 -> "William Shakespeare" +
                            "The greatest play script writer in history,who wrote dramas that [put you to tears"

                    50->"Ludwing Van Beetoven" +
                            "One of the greatest musical geniuses in history of music "

                    43->"Leonardo da Vinci" +
                            "A multiple skill,talented  person who made a name for him self in history "

                    31->"Galileo Galile" +
                            "The farther of astronomy, know for his observations into the stars"

                    33->"Jesus christ" +
                            "Took all sins to save humanity from the wrath of GOD "

                    else -> null
                }

                val message = if (historicalPerson != null) "The person  name is $historicalPerson." else TODO()
                resultTextView.text = message.toString()

            } else {
                resultTextView.text = "Invalid age.Please enter a valid age"

            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }


}

