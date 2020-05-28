package com.example.myapplication

class Scoreboard {
    var board = IntArray(20)
        get() {
            var x = 0
            while (x < 20) {
                if (field[x] > 15) {
                    field[x] = 15
                } else {
                    field[x] = field[x]
                }
                x++
            }
            return field
        }
    var idx: Int = 0
    var score: Int = 0
        set(value) {
            board[idx] = value
            ++idx
        }
}
