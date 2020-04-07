package com.example.hello_app.demo

import java.awt.Color
import java.awt.Color.*
import java.lang.Exception


fun main(){
        fun getWarmth(color: Color): String {
                return when(color) {
                        RED, ORANGE, YELLOW -> "warm"
                        GREEN -> "neutral"
                        BLUE, INDIGO, VIOLET -> "cold"
                        else -> "@null"
                }
        }
        println(getWarmth(ORANGE))
}
