package org.example;

public class Main {
    private static final int row = 6;
    private static final int column = 7;
    public static void main(String[] args) {

       System.out.println("Welcome to connect four!");
       System.out.println("Board size " + column + " comlumns x " + row + " rows");
       System.out.println("Game mod: Player vs Player");
        Board board = new Board();
        for (int j = 0; j <4; j++){
            for (int k = 0; k <3-j; k++){
                board.dropPiece(j,'0');
            }
            board.dropPiece(j,'X');
        }
        board.printBoard();

        if(board.winCheck('X')) {
            System.out.println("You win!");
        }


   }

}
