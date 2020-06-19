package com.valadares.sumzero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSamples()
    }

    private fun showSamples() {
        var numbersList = listOf<Int>()
        val stringBuilder = StringBuilder()

        stringBuilder.append(getInputString(numbersList))
        stringBuilder.append(getResultString(numbersList))

        numbersList = listOf(1, 2)
        stringBuilder.append(getInputString(numbersList))
        stringBuilder.append(getResultString(numbersList))

        numbersList = listOf(1, 2, 4, 7)
        stringBuilder.append(getInputString(numbersList))
        stringBuilder.append(getResultString(numbersList))

        numbersList = listOf(-4, -3, -2, 1, 2, 3, 5)
        stringBuilder.append(getInputString(numbersList))
        stringBuilder.append(getResultString(numbersList))

        numbersList = listOf(-4, -3, -2, 1, 2, 5)
        stringBuilder.append(getInputString(numbersList))
        stringBuilder.append(getResultString(numbersList))

        textViewResults.text = stringBuilder
    }

    private fun getInputString(numbersList: List<Int>) = getString(R.string.input, numbersList)

    private fun getResultString(numbersList: List<Int>) = getString(R.string.result, numbersList.sumZero())
}