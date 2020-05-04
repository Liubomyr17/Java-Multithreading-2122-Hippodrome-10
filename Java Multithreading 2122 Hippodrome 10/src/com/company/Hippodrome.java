package com.company;

/*

2113 Hippodrome 10

You also need to write the print method of the Hippodrome class.
Everything is simple in it too: in the loop for each horse, call its print method.
Well, and print 10 empty lines after the loop: System.out.println () - to make it more beautiful.

Requirements:
1. In the print method of the Hippodrome class, the print method must be called once for each horse (each element of the horses list).
2. In the print method, 10 blank lines should be displayed.


 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        }

        public void move() {
        horses.forEach(Horse::move);
        }

        public void print() {
        for (Horse horse : this.horses) {
            horse.print();
        }
        for (int i=0; i<10; i++) {
            System.out.println();
        }
        }
        
        public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
}

