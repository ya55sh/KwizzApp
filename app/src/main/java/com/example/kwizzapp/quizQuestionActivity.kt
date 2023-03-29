package com.example.kwizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class quizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        val tvQuestion : TextView = findViewById(R.id.tvQuestion)
        val questionList = Constants.getQuestions()

        for (j in questionList){
            Log.i("question","${j.question}")
         //tvQuestion.text =
        }


        //Log.i("Question", "$questionList")

    }
}