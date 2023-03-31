package com.example.kwizzapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlin.reflect.typeOf

class quizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    var currentPosition : Int = 1
    var questionList : ArrayList<Question>?= null
    var selectedOptionPosition : Int = 0

    var tvQuestion : TextView ?= null
    var progressBar : ProgressBar ?= null
    var tvProgress : TextView ?= null
    var ivImage : TextView ?= null

    var btnSubmit : Button ?= null

    var optionOne : TextView ?= null
    var optionTwo : TextView ?= null
    var optionThree : TextView ?= null
    var optionFour : TextView ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        tvQuestion = findViewById(R.id.tvQuestion)
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        ivImage = findViewById(R.id.ivImage)

        btnSubmit = findViewById(R.id.btnSubmit)

        optionOne = findViewById(R.id.optionOne)
        optionTwo = findViewById(R.id.optionTwo)
        optionThree = findViewById(R.id.optionThree)
        optionFour = findViewById(R.id.optionFour)

        optionOne?.setOnClickListener(this)
        optionTwo?.setOnClickListener(this)
        optionThree?.setOnClickListener(this)
        optionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        questionList = Constants.getQuestions()

        setQuestion()

    }

    private fun setQuestion() {
        currentPosition = 1
        val question: Question = questionList!![currentPosition - 1]
        tvQuestion?.text = question.question
        ivImage?.text = currentPosition.toString()
        progressBar?.progress = currentPosition
        tvProgress?.text = "${currentPosition}/${progressBar?.max}"
        optionOne?.text = question.option1
        optionTwo?.text = question.option2
        optionThree?.text = question.option3
        optionFour?.text = question.option4

        if(currentPosition == questionList!!.size){
            btnSubmit?.text = "FINISH"
        }
    }

    private fun defaultOptionView(){
        var options = ArrayList<TextView>()

        optionOne?.let {
            options.add(0,it)
        }

        optionTwo?.let {
            options.add(1,it)
        }

        optionThree?.let {
            options.add(2,it)
        }

        optionFour?.let {
            options.add(3,it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.border_bg)
        }
    }

    private fun selectedOptionView(tv:TextView, selectedOp:Int){
        defaultOptionView()

        selectedOptionPosition = selectedOp

        tv.setTextColor(Color.parseColor("#264653"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selection_border)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.optionOne -> {
                optionOne?.let{
                    selectedOptionView(it,1)
                }
            }

            R.id.optionTwo -> {
                optionTwo?.let{
                    selectedOptionView(it,2)
                }
            }

            R.id.optionThree -> {
                optionThree?.let{
                    selectedOptionView(it,3)
                }
            }

            R.id.optionFour -> {
                optionFour?.let{
                    selectedOptionView(it,4)
                }
            }

            R.id.btnSubmit -> {
                //todo
            }

        }
    }
}