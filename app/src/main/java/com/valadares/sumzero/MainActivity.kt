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
        val stringBuilder = StringBuilder()
        stringBuilder.append("Input: lista vazia / ")
        stringBuilder.append("Retorno:" + listOf<Int>().sumZero().toString())
        stringBuilder.append(LINE_BREAK)

        stringBuilder.append("Input: 1, 2 / ")
        stringBuilder.append("Resultado:" + listOf(1, 2).sumZero().toString())
        stringBuilder.append(LINE_BREAK)

        stringBuilder.append("Input: 1, 2, 4, 7 / ")
        stringBuilder.append("Resultado:" + listOf(1, 2, 4, 7).sumZero().toString())
        stringBuilder.append(LINE_BREAK)

        stringBuilder.append("Input: -4, -3, -2, 1, 2, 3, 5 / ")
        stringBuilder.append("Resultado:" + listOf(-4, -3, -2, 1, 2, 3, 5).sumZero().toString())
        stringBuilder.append(LINE_BREAK)

        stringBuilder.append("Input: -4, -3, -2, 1, 2, 5 / ")
        stringBuilder.append("Resultado:" + listOf(-4, -3, -2, 1, 2, 5).sumZero().toString())

        textViewResults.text = stringBuilder
    }

    companion object {
        const val LINE_BREAK = "\n"
    }
}