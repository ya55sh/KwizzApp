package com.example.kwizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ExitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit)

        var tvName : TextView = findViewById(R.id.tvName)
        var tvScore : TextView = findViewById(R.id.tvScore)
        var btnFinish : Button = findViewById(R.id.btnFinish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        var totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        var correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvScore.text = "Your score is $correctAnswers/$totalQuestions"

        btnFinish.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}