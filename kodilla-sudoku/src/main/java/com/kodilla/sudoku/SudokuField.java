package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuField {
    ArrayList<SudokuElement> field = new ArrayList<>();

    public void createField(SudokuBoard board, int fieldNumber) {
    switch (fieldNumber) {
        case 0:
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 1:
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 6; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 2:
            for (int i = 0; i < 3; i++) {
                for (int j = 6; j < 9; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 3:
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 4:
            for (int i = 3; i < 6; i++) {
                for (int j = 3; j < 6; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 5:
            for (int i = 3; i < 6; i++) {
                for (int j = 6; j < 9; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 6:
            for (int i = 6; i < 9; i++) {
                for (int j = 0; j < 3; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 7:
            for (int i = 6; i < 9; i++) {
                for (int j = 3; j < 6; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        case 8:
            for (int i = 6; i < 9; i++) {
                for (int j = 6; j < 9; j++) {
                    field.add(board.getBoard().get(i).getRow().get(j));
                }
            }
        }
    }

    public ArrayList<SudokuElement> getField() {
        return field;
    }
}
