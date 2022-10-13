package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here

        final int ROWS = 5;
        final int COLS = 4;

        for(int i = 0; i < ROWS; i++){
            for(int j = 1; j < COLS; j++){
                System.out.print(i+j+"  ");
            }
            System.out.println(" ");
        }

//        char c = 'H';
//        System.out.println(c);
//        System.out.println((int)c);
//
//        for(int i = 0; i < 255; i++) {
//            System.out.print((char)i + "  ");
//        }
//
//        final int ROWS = 8;
//        final int COLS = 8;
//
//        for(int i = 0; i < ROWS; i++){
//            for(int j = 0; j < COLS; i++) {
//                if((i+j) % 2 == 0) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }



    }

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here

        final int ROWS = 6;
        final int COLS = 11;

        for(int i=1; i <=ROWS; i++){
            for(int j=1; j <=COLS-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            System.out.print("");
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}