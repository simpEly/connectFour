package org.example;

public class Main {
    private static final int row = 6;
    private static final int column = 7;
    public static void main(String[] args) {

       System.out.println("Welcome to connect four!");
       System.out.println("Board size " + column + " comlumns x " + row + " rows");
       System.out.println("Game mod: Player vs Player");
       Board board = new Board();
       Player p1 = new Human("khanh",'X');
       Player p2 = new Human("kha",'O');
       Gameplay game = new Gameplay(board,p1,p2);
       game.start();

        }


   }


