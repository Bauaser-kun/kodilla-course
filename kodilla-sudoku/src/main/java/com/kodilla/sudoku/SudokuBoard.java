package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> board = new ArrayList<>();
    private List<SudokuField> fields = new ArrayList<>();

    public void createBoard() {
        for (int i = 0; i < 9; i ++) {
            board.add(new SudokuRow());
            board.get(i).createRow();
        }
    }

    public void separateFieldsOnBoard(SudokuBoard board) {
        for (int i = 0; i < 9; i++) {
            fields.add(new SudokuField());
            fields.get(i).createField(board, i);
        }
    }

    public List<SudokuField> getFields() {
        return fields;
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    @Override
    public String toString() {
        StringBuilder printBoard = new StringBuilder("    1   2   3   4   5   6   7   8   9" + "\n");

        for(int i = 0; i < 9; i++) {
            printBoard.append(1 + i).append(" |");
            for(int j = 0; j < 9; j++) {
                if(getBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {
                    printBoard.append(" - ");
                } else {
                    printBoard.append(" ");
                    printBoard.append(getBoard().get(i).getRow().get(j).getValue());
                    printBoard.append(" ");
                }
                printBoard.append("|");
            }
            printBoard.append("\n");
        }
        return printBoard.toString();
    }

    public void setElementInRow(int row, int element, int value) {
        board.get(row).setElement(element, value);
    }
}
