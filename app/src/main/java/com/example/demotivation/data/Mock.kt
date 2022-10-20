package com.example.demotivation.data

import android.content.Context
import com.example.demotivation.R
import com.example.demotivation.infra.MotivationConstants
import kotlin.random.Random


data class Phrase(val description: String, val categoryId: Int) {}

class Mock(private val context: Context) {

    private val sunny = MotivationConstants.FILTER.SUNNY
    private val happy = MotivationConstants.FILTER.HAPPY
    private val all = MotivationConstants.FILTER.ALL

    private val happyPhrases = context.resources.getStringArray(R.array.phrases_happy).map {
        Phrase(it, happy)
    }

    private val sunnyPhrases = context.resources.getStringArray(R.array.phrases_sunny).map {
        Phrase(it, sunny)
    }

    private val mListPhrase = happyPhrases + sunnyPhrases

    fun getPhrase(value: Int): String {
        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].description
    }

}