package org.example;


import java.util.Scanner;

public class Main {
    private static final int row = 6;
    private static final int column = 7;

    public static void main(String[] args) {

        System.out.println("Welcome to connect four!");
        System.out.println("Board size " + column + " comlumns x " + row + " rows");
        System.out.println("Please choose a game mode!\n" + "1. Player vs Player\n" + "2. Player vs Computer");
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        while (true) {
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Please choose a number between 1 and 2");
                continue;
            }
            int mode = sc.nextInt();
            sc.nextLine();
            if (mode < 1 || mode > 2) {
                System.out.println("Please choose a number between 1 and 2");
                continue;
            }
            if (mode == 1) {
                System.out.println("Player vs Player mode start!");
                Player p1 = new Human("Player1",'X');
                Player p2 = new Human("Player2",'O');
                Gameplay game = new Gameplay(board, p1, p2);
                game.start();
                break;
            }
            if (mode == 2) {
                System.out.println("Player vs Computer mode start!");
                Player p1 = new Human("Player1",'X');
                Player p2 = new ComputerPlayer('O');
                Gameplay game = new Gameplay(board, p1, p2);
                game.start();
                break;
            }
        }


    }




}





