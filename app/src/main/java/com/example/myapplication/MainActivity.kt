package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cnt: Int = 0
        var prev: Int = -1
        var dice = Dice()
        var scoreboard = Scoreboard()
        var dices = ""
        var points = IntArray(20)

        button.setOnClickListener()
        {

            var score: Int = dice.rollDice()
            cnt += 1
            dices = dices + score + " "

            textView.setText("Count: " + cnt)
            textView2.setText("Dice: " + score)
            textView3.setText(dices)
            if (prev == dice.point) {
                score += 10
            }
            prev = dice.point
            scoreboard.score = score

            points = scoreboard.board

            if (cnt == 20) {
                var nextIntent = Intent(this,Main2Activity::class.java)
                nextIntent.putExtra("points",points)
                startActivity(nextIntent)
            }

        }
    }

}
