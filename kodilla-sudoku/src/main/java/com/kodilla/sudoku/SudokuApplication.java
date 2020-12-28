package com.kodilla.sudoku;

public class SudokuApplication {
   public static void main(String[] args) {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame game = new SudokuGame();
            SudokuBoard board = game.createNewBoard();
            board.createFields(board);
            game.showBoard(board);
            game.fillSudoku(board);
            gameFinished = game.resolveSudoku(board);
            game.showBoard(board);
        }
    }
}
