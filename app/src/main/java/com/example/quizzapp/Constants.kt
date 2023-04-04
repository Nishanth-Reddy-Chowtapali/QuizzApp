package com.example.quizzapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
            "Pakistan", "Australia", "Sri Lanka", "germany",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "South Africa", "Japan", "Nepal", "Belgium",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Canada", "Brazil", "Afghanistan", "Austria",
            2
        )
        questionsList.add(que4)

        val que5 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Argentina", "Denmark", "Canada", "Austria",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Sri Lanka", "Australia", "Fiji", "Bhutan",
            3
        )
        questionsList.add(que6)

        val que7 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Chile", "Hungary", "Libya", "germany",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
            "India", "Namibia", "Thailand", "Zimbabwe",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Norway", "netherlands", "nepal",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Myanmar", "Morocco", "Oman", "Kuwait",
            4
        )
        questionsList.add(que10)

        return questionsList
    }

}