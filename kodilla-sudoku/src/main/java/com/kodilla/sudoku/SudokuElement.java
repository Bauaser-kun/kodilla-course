package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value = EMPTY;
    ArrayList<Integer> possibleValues = new ArrayList<>();

    public void fillPossibleValues(){
        for (int i = 1; i <= 9; i++) {
            possibleValues.add(i);
        }
    }

    public void removeValueFromPossibleValues(int value) {
    for (int i = 0; i < possibleValues.size(); i++) {
        if (possibleValues.get(i) == value) {
            possibleValues.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        if(value != EMPTY) {
            return " " + value;
        }
        else {
            return "  ";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuElement that = (SudokuElement) o;
        return value == that.value && Objects.equals(possibleValues, that.possibleValues);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (possibleValues != null ? possibleValues.hashCode() : 0);
        return result;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
