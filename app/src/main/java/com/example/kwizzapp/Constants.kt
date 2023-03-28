package com.example.kwizzapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1, "what is this daal/pulse called?",
            1,
            "Arhar",
            "Malka",
            "Urad",
            "Masoor",
            1
        )

        questionList.add(ques1);
        return questionList
    }

}