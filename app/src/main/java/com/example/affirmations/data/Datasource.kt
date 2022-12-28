package com.example.affirmations.data

//import data dari strings.xml dan model dari affirmation
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

//membuat class DataSource
class Datasource {
    //membuat fungsi yang akan mereturn nilai dari list Affirmation
    fun loadAffirmations() : List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}