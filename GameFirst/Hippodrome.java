package com;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses;
    static Hippodrome game;
    public static void main(String[] args) {
        horses = new ArrayList<Horse>();
        Horse horse1 = new Horse("Бавария", 3, 0);
        Horse horse2 = new Horse("Билли", 3, 0);
        Horse horse3 = new Horse("Жазель", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();

    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void run() {
        for (int i = 1; i < 101; i++) {
            move();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print();
        }
    }

    void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }

    }

    void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse s : horses) {
            if (s.getDistance() > result.getDistance()) {
                result = s;
            }
        }
        return result;
    }
}












































