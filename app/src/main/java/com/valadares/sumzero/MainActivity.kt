package com.valadares.sumzero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumZero(listOf(-1,0,1,2,3,4))
    }

    fun sumZero(numbersList: List<Int>): Pair<Int, Int>? {
        for (number in numbersList) {
            numbersList.firstOrNull { it + number == 0 }?.let { firstMatch ->
                return Pair(number, firstMatch)
            }
        }
        return null
    }

}