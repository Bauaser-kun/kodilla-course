package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuApplication {
   public static void main(String[] args) {
        boolean gameFinished = false;
        boolean sudokuResolved;
       Scanner scanner = new Scanner(System.in);

        while (!gameFinished) {
            SudokuGame game = new SudokuGame();
            SudokuBoard board = game.createNewBoard();
            board.separateFieldsOnBoard(board);
            game.showBoard(board);
            game.fillSudoku(board);
            sudokuResolved = game.resolveSudoku(board);
            game.showBoard(board);
            System.out.println("Start again?");
            if(scanner.next().startsWith("y")) {
                gameFinished = !sudokuResolved;
            } else {
                gameFinished = sudokuResolved;
            }
        }
    }
}
