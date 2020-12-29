package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    int userInput, rowNumber, columnNumber, value;

    public boolean resolveSudoku(SudokuBoard board) {
        int row = 0;
        int column = 0;
        int[] isSolved = getNotFilled(board, row, column);

        if (isSolved[0] == 0) {
            return true;
        }

        row = isSolved[1];
        column = isSolved[2];

        for (int i = 0; i < 9; i++) {
            if(isSafe(board, i + 1, row, column)) {
                board.setElementInRow(row, column, i + 1);
            if (resolveSudoku(board)) {
              return true;
                }

            board.getBoard().get(row).getRow().get(column).setValue(-1);
            }
        }
        return false;
    }

    public boolean isSafe(SudokuBoard board, int number, int row, int column) {
        for(int i = 0; i < 9; i++) {
            if(board.getBoard().get(row).getRow().get(i).getValue() == number) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if(board.getBoard().get(i).getRow().get(column).getValue() == number) {
                return false;
            }
        }

        int startRow = (row/3) * 3;
        int startColumn = (column/3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (board.getBoard().get(i).getRow().get(j).getValue() == number) {
                    return false;
                }
            }
        }

        return true;
    }

    private int[] getNotFilled(SudokuBoard board, int row, int column) {
    int notFilled = 0;

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if(board.getBoard().get(i).getRow().get(j).getValue() == -1) {
                row = i;
                column = j;
                notFilled = 1;
                int[] ints = {notFilled, row, column};
                return ints;
                }
            }
        }

    int[] ints = {notFilled, -1, -1};
    return ints;
    }

    public void showBoard(SudokuBoard board) {
        System.out.println(board.toString());
    }

    public void fillSudoku(SudokuBoard board) {
        Boolean endFilling;
        do {
            endFilling = setElement(board);
        }
        while ((!endFilling) || (!checkAllElements(board)));
    }

    private Boolean setElement(SudokuBoard board) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean check;

        System.out.println("Provided initial state of Sudoku board using 3-digit coding ROW COLUMN VALUE\n" +
                "for example 234 means \"In row 2, column 3 set value 4\"");
        System.out.println("when you set your values type SUDOKU to resolve it.");

        do {
            input = scanner.next();
            if(input.toLowerCase().equals("sudoku")) {
                return true;
            }

            userInput = Integer.parseInt(input);
            rowNumber = userInput/100 % 10;
            columnNumber = userInput/10 %10;
            value = userInput % 10;
            check = (userInput < 111 || userInput > 999);

            if(check || userInput % 10 == 0) {
                System.out.println("Value must be in 1-9 range!");
            } else if (board.getBoard().get(rowNumber - 1).getRow().get(columnNumber - 1).getValue() != -1) {
                System.out.println("this cell is already filled, \n" +
                        "please choose another or resolve puzzle by typing \"sudoku\"");
            } else if (checkValue(board, rowNumber, columnNumber, value)) {
                System.out.println("Putting this value here would create invalid sudoku! \n" +
                        "Please provide different value");
            } else if (checkEmpty(board, rowNumber, columnNumber)) {
                System.out.println("No value could be set on this cell");
                return true;
            } else {
                board.setElementInRow(rowNumber - 1, columnNumber - 1, value);
                showBoard(board);
            }
        } while (check);
        return false;
    }

    private boolean checkEmpty(SudokuBoard board, int row, int column) {
    return (board.getBoard().get(row - 1).getRow().get(column - 1).getPossibleValues().size() == 0);
    }

    public boolean checkValue(SudokuBoard board, int row, int column, int value) {
    int fieldNumber = getFieldNumber(row - 1, column - 1);
        for (int i = 0; i < 9; i++) {
        if((board.getBoard().get(row - 1).getRow().get(i).getValue() != -1) &&
            (board.getBoard().get(row - 1).getRow().get(i).getValue() == value)) {
            return true;
            } else if ((board.getBoard().get(i).getRow().get(column - 1).getValue() != -1) &&
                (board.getBoard().get(i).getRow().get(column - 1).getValue() == value)) {
                return true;
            } else if(board.getFields().get(fieldNumber).getField().get(i).getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public int getFieldNumber(int row, int column) {
        if(row < 3 && column < 3) {
            return 0;
        } else if(row < 3 && column >= 3 && column < 6) {
            return 1;
        } else if(row < 3 && column >= 6 && column < 9) {
            return 2;
        } else if(row >= 3 && row < 6 && column < 3) {
            return 3;
        } else if(row >= 3 && row < 6 && column >= 3 && column < 6) {
            return 4;
        } else if(row >= 3 && row < 6 && column >= 6 && column < 9) {
            return 5;
        } else if(row >= 6 && row < 9 && column < 3) {
            return 6;
        } else if(row >= 6 && row < 9 && column >= 3 && column < 6) {
            return 7;
        } else {
            return 8;
        }
    }

    private boolean checkAllElements(SudokuBoard board) {
        for(int i = 0; i < 0; i++) {
            for (int j = 0; j < 9; j++) {
                if (board.getBoard().get(i).getRow().get(j).getValue() == -1) {
                    return false;
                }
            }
        }

        return true;
    }

    public SudokuBoard createNewBoard() {
        SudokuBoard board = new SudokuBoard();
        board.createBoard();
        return board;
    }
}
