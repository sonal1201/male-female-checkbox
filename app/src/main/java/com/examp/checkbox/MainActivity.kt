package com.examp.checkbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var male : CheckBox
    lateinit var female : CheckBox
    lateinit var result : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        male = findViewById(R.id.male)
        female = findViewById(R.id.female)
        result = findViewById(R.id.result)

        male.setOnClickListener {
            if(male.isChecked){
                result.text="Your gender is Male."
                female.isChecked=false
            }
            else{
                result.text="What is your gender?"
            }
        }
        female.setOnClickListener {
            if(female.isChecked){
                result.text="Your gender is Female"
                male.isChecked=false
            }
            else{
                result.text="What is your gender?"
            }
        }
    }
}