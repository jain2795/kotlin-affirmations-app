package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        val affirmationsList: MutableList<Affirmation> = mutableListOf()

        affirmationsList.add(Affirmation(R.string.affirmation1, R.drawable.image1))
        affirmationsList.add(Affirmation(R.string.affirmation2, R.drawable.image2))
        affirmationsList.add(Affirmation(R.string.affirmation3, R.drawable.image3))
        affirmationsList.add(Affirmation(R.string.affirmation4, R.drawable.image4))
        affirmationsList.add(Affirmation(R.string.affirmation5, R.drawable.image5))
        affirmationsList.add(Affirmation(R.string.affirmation6, R.drawable.image6))
        affirmationsList.add(Affirmation(R.string.affirmation7, R.drawable.image7))
        affirmationsList.add(Affirmation(R.string.affirmation8, R.drawable.image8))
        affirmationsList.add(Affirmation(R.string.affirmation9, R.drawable.image9))
        affirmationsList.add(Affirmation(R.string.affirmation10, R.drawable.image10))

        return affirmationsList
    }
}