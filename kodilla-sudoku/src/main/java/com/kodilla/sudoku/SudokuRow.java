package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public int rowNumber;
    private List<SudokuElement> row = new ArrayList<>();

    public void createRow() {
        for (int i = 0; i < 9; i++) {
            row.add(new SudokuElement());
            row.get(i).fillPossibleValues();
        }
    }

    public SudokuRow() {
        for (int i = 0; i < 9; i++) {
            row.add(i, new SudokuElement());
        }
    }

    public void showElements(int index) {
        System.out.println(row.get(index));
    }

    public void removeOneOfPossibleValuesFromRow(int value) {
        for (int i = 0; i < 9; i++) {
            getRow().get(i).removeValueFromPossibleValues(value);
        }
    }

    public List<SudokuElement> getRow() {
        return row;
    }

    public void setElement(int elementNumber, int elementValue) {
        row.get(elementNumber).setValue(elementValue);
    }
}
