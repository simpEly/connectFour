package org.example;
import java.util.Scanner;


public class Gameplay {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    Scanner scan = new Scanner(System.in);

    public Gameplay(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }
    public void start() {
        while (true) {
            System.out.println("Choose the first player to play:\n"+"1. Player 1\n"+"2. Player 2");
            if(!scan.hasNextInt()) {
                System.out.println("Please enter a number");
                scan.nextLine();
                continue;
            }
            int choice = scan.nextInt();
            if(choice < 1 || choice > 2) {
                System.out.println("Please choose a number between 1 and 2");
                continue;
            }
            if (choice == 1) {
                currentPlayer = player1;
                break;
            }
            else if (choice == 2) {
                currentPlayer = player2;
                break;
            }
        }
        while (true) {
            int col = currentPlayer.chooseColumn(board);
            if (!board.dropPiece(col, currentPlayer.getSymbol())) {
                System.out.println("Dropping unsuccessfully");
                continue;
            }
            board.printBoard();
            if (board.winCheck(currentPlayer.getSymbol())) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }
            if (board.isFull()) {
                System.out.println("Draw!");
                break;
            }
            currentPlayer = (currentPlayer==player1) ? player2 : player1;
        }
    }

}
