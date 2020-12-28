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

    public void createFields(SudokuBoard board) {
        for (int i = 0; i < 9; i++) {
            fields.add(new SudokuField());
            fields.get(i).createField(board, i);
        }
    }

    public void removeOneValueFromColumnPossibleValues(SudokuBoard board, int columnNumber, int value) {
        for (int i = 0; i < 9; i++) {
            board.board.get(i).getRow().get(columnNumber).removeValueFromPossibleValues(value);
        }
    }

    public void removeOneValueFromFieldPossibleValues(SudokuBoard board, int fieldNumber, int value) {
        for (int i = 0; i < 9; i++) {
            board.getFields().get(fieldNumber).getField().get(i).removeValueFromPossibleValues(value);
        }
    }

    public List<SudokuField> getFields() {
        return fields;
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    public void showRow(int number) {
        System.out.println(board.get(number));
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

    public void setBoard(List<SudokuRow> board) {
        this.board = board;
    }

    public void setElementInRow(int row, int element, int value) {
        board.get(row).setElement(element, value);
    }
}
