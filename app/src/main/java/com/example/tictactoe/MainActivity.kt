package com.example.tictactoe

import android.os.Bundle
import android.view.View
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
        board = Array(3) { Array(3) { "" } } // Initialize the board with empty strings
        buttons = Array(3) { Array(3) { Button(this) } } // Initialize button array

        for (i in 0..2) {
            for (j in 0..2) {
                val buttonID = "button_$i$j"
                val resID = resources.getIdentifier(buttonID, "id", packageName)
                buttons[i][j] = findViewById(resID)

                // Set the onClick listener for each button
                buttons[i][j].setOnClickListener {
                    makeMove(i, j)
                }
            }
        }
    }

    private fun makeMove(row: Int, col: Int) {
        // Check if the button is already clicked
        if (board[row][col].isNotEmpty()) return

        // Update the board and button text
        board[row][col] = if (isPlayerX) "X" else "O"
        buttons[row][col].text = board[row][col]
        buttons[row][col].isEnabled = false

        // Check for a win or draw
        if (checkWin()) {
            resultTextView.text = if (isPlayerX) "Player X wins!" else "Player O wins!"
            resultTextView.visibility = View.VISIBLE
            playAgainButton.visibility = View.VISIBLE
            disableAllButtons()
        } else if (checkDraw()) {
            resultTextView.text = "It's a draw!"
            resultTextView.visibility = View.VISIBLE
            playAgainButton.visibility = View.VISIBLE
        } else {
            // Change turn
            isPlayerX = !isPlayerX
        }
    }

    private fun checkDraw(): Boolean {
        TODO("Not yet implemented")
    }

    private fun disableAllButtons() {
        TODO("Not yet implemented")
    }

    private fun checkWin(): Boolean {
        TODO("Not yet implemented")
    }

}
