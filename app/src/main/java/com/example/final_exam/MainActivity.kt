package com.example.final_exam

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.example.final_exam.R

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    lateinit var rb1: RadioButton
    lateinit var rb2: RadioButton
    lateinit var rb3: RadioButton
    lateinit var rb4: RadioButton
    lateinit var rb5: RadioButton
    lateinit var rb6: RadioButton
    lateinit var btn_time1: Button
    lateinit var btn_time2: Button
    lateinit var txt_display: TextView
    var maxVal = 0
    var randomVal = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        rb1 = findViewById(R.id.four_side)
        rb2 = findViewById(R.id.six_side)
        rb3 = findViewById(R.id.eight_side)
        rb4 = findViewById(R.id.ten_side)
        rb5 = findViewById(R.id.twelve_side)
        rb6 = findViewById(R.id.twenty_side)

        btn_time1 = findViewById(R.id.one_time)
        btn_time2 = findViewById(R.id.two_time)
        txt_display = findViewById(R.id.display)

        btn_time1.setOnClickListener(View.OnClickListener {
            val choice = radioGroup.checkedRadioButtonId
            if (choice == R.id.four_side) {
                maxVal = 4
            } else if (choice == R.id.six_side) {
                maxVal = 6
            } else if (choice == R.id.eight_side) {
                maxVal = 8
            } else if (choice == R.id.ten_side) {
                maxVal = 10
            } else if (choice == R.id.twelve_side) {
                maxVal = 12
            } else if (choice == R.id.twenty_side) {
                maxVal = 20
            }
            randomVal = (Math.random() * maxVal + 1).toInt()
            txt_display.text = randomVal.toString()
        })
        btn_time2.setOnClickListener(View.OnClickListener {
            val choice = radioGroup.checkedRadioButtonId
            if (choice == R.id.four_side) {
                maxVal = 4
            } else if (choice == R.id.six_side) {
                maxVal = 6
            } else if (choice == R.id.eight_side) {
                maxVal = 8
            } else if (choice == R.id.ten_side) {
                maxVal = 10
            } else if (choice == R.id.twelve_side) {
                maxVal = 12
            } else if (choice == R.id.twenty_side) {
                maxVal = 20
            }
            randomVal = (Math.random() * maxVal + 1).toInt()
            txt_display.text = randomVal.toString()
        })
    }
}






