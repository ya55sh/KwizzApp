package com.example.kwizzapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
            1, "What is this daal/pulse called?",
            1,
            "Arhar",
            "Malka",
            "Urad",
            "Masoor",
            1
        )
        questionList.add(ques1);

        val ques2 = Question(
            2, "Which place is called the yoga capital of the world?",
            2,
            "Bengaluru",
            "Jaipur",
            "Shimla",
            "Rishikesh",
            4
        )
        questionList.add(ques2);

        val ques3 = Question(
            3, "How many days are there in the month of Feb in a leap year?",
            3,
            "30",
            "28",
            "29",
            "31",
            3
        )
        questionList.add(ques3);

        val ques4 = Question(
            4, "What is the speed of light?",
            3,
            "1 * 10^6",
            "1 * 10^5",
            "1 * 10^8",
            "1 * 10^9",
            4
        )
        questionList.add(ques4);
        return questionList
    }

}