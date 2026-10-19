package org.example;
import java.util.Arrays;

public class Board {
    private static int column = 7;
    private static int row = 6;
    private char[][] board = new char[row][column];

    public int getColumn()
    {
        return column;
    }

    public int getRow()
    {
        return row;
    }

    public Board() {
        for (int i = 0; i < row; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public void printBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print("|" + board[i][j]);

            }
            System.out.println("|");
        }
    }

    public boolean isValid(int i, int j) {
        return j >= 0 && j < column && board[i][j] == ' ';
    }

    public boolean dropPiece(int j, char symbol) {
        for (int i= row-1 ; i>=0; i--) {
            if (board[i][j] == ' ') {
                board[i][j] = symbol;
                return true;
            }
            if(j<0 || j>=column) return false;
        }
        return false;
    }
    public boolean winCheck(char symbol) {
        if (symbol == ' ') return false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column-3; j++) {
                if (
                board[i][j] == symbol &&
                board[i][j+1] == symbol &&
                board[i][j+2] == symbol &&
                board[i][j+3] == symbol
                ) {
                    return true;
                }
            }
        }
        for (int i = 0; i < row-3; i++) {
            for (int j = 0; j < column; j++) {
                if (
                board[i][j] == symbol &&
                board[i+1][j] == symbol &&
                board[i+2][j] == symbol &&
                board[i+3][j] == symbol

                ) {
                    return true;
                }
            }
        }
        for (int i = 0; i < row-3; i++) {
            for (int j = 0; j < column-3; j++) {
                if (
                        board[i][j] == symbol &&
                        board[i+1][j+1] == symbol &&
                        board[i+2][j+2] == symbol &&
                        board[i+3][j+3] == symbol
                ) {
                    return true;
                }
            }
        }
        for (int i = row-1; i >=3; i++) {
            for (int j = 0; j < column-3; j++) {
                if (
                        board[i][j] == symbol &&
                        board[i-1][j+1] == symbol &&
                        board[i-2][j+2] == symbol &&
                        board[i-3][j+3] == symbol

                ) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isFull() {
        for (int j = 0; j < column; j++) {
            if (board[0][j] == ' ') {
                return false;
            }
        }
        return true;
    }
}

