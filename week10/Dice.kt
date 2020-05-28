package com.example.myapplication
import kotlin.random.Random
class Dice {
 var point: Int = 0
 get() {
 return field
 }
 set(value) {
 field = value
 }
 fun rollDice(): Int {
 point = Random.nextInt(11)
 return point
 }
}
