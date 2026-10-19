package org.example;
import java.util.Scanner;
public class Human extends Player {
    Scanner sc = new Scanner(System.in);
    public Human(String name, char symbol) {
        super(name, symbol);
    }
    @Override
    public int chooseColumn(Board b) {
        while (true) {
            System.out.println("Choose column: ");
            if(!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Please enter a number between 1 and 7");
                continue;
            }
            int choice = sc.nextInt();
            choice-=1;
            sc.nextLine();
            if(b.isValid(0,choice)) {
                return choice;
            }

            System.out.println("Invalid column");

        }
    }


}
