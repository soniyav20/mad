package com.example.myapplication
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text= findViewById<EditText>(R.id.input1);
        val text2= findViewById<EditText>(R.id.input2);

        val fbutton= findViewById<Button>(R.id.button);
        val cbutton= findViewById<Button>(R.id.button2);
        val bgbutton= findViewById<Button>(R.id.button3);

        fbutton.setOnClickListener {
            text.textSize= text.textSize + 2;
        }

        cbutton.setOnClickListener {
            text.setTextColor(Color.RED);
        }

        bgbutton.setOnClickListener {
            text.setBackgroundColor(Color.BLUE);
        }
    }

}