package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player{


    public ComputerPlayer(char symbol) {
        super("Com",symbol);
    }

    @Override
    public int chooseColumn(Board board) {
        List<Integer> validCol = new ArrayList<>();
        for (int i = 0; i < board.getColumn(); i++) {
            if (board.isValid(0,i)) {
                validCol.add(i);
            }
        }
        Random rand = new Random();
        int col = validCol.get(rand.nextInt(validCol.size()));
        System.out.println("Computer player choose column: " + col);
        return col;

    }

}
