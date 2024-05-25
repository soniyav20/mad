package com.example.myapplication
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text= findViewById<EditText>(R.id.input1);
        val text2= findViewById<EditText>(R.id.input2);
        val plus= findViewById<Button>(R.id.plus);
        val minus= findViewById<Button>(R.id.minus);
        val mul= findViewById<Button>(R.id.mul);
        val div= findViewById<Button>(R.id.div);
        val res= findViewById<TextView>(R.id.editTextTextPersonName);

        plus.setOnClickListener {
            val num1 = text.text.toString().toBigInteger();
            val num2 = text2.text.toString().toBigInteger();
            res.text = (num1 + num2).toString();
        }
    }
}