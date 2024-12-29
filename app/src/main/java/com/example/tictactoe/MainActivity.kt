package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var isPlayerX = true
    private lateinit var board: Array<Array<String>>
    private lateinit var buttons: Array<Array<Button>>
    private lateinit var resultTextView: TextView
    private lateinit var playAgainButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        playAgainButton = findViewById(R.id.playAgainButton)

        // Initialize board and buttons
        initBoard()

        // Handle play again button click
        playAgainButton.setOnClickListener {
            resetGame()
        }
    }

    private fun resetGame() {
        TODO("Not yet implemented")
    }

    private fun initBoard() {
        TODO("Not yet implemented")
    }
}
