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
        println("point : " + point)
        return point
    }
}

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

fun main() {
    var dice = Dice()
    var scoreboard = Scoreboard()

    var prev: Int = -1
    var cnt: Int = 0

    while (true) {
        var score: Int = dice.rollDice()
        ++cnt
        if (prev == dice.point) {
            score += 10
        }
        prev = dice.point
        scoreboard.score = score

        var points = scoreboard.board
        var x = 0
        if (cnt == 20) {
            println("[scoreboard]")
            while (x < 20) {
                print(points[x])
                print(" ")
                x++
            }
            return
        }
    }
}