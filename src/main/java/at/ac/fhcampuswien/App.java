package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        // input your solution here

        Scanner scan = new Scanner(System.in);

        System.out.print("n:");

        int ROWS = scan.nextInt();

        int x = 1;
        int y = 1 + x;

        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < ROWS; col++){
                if (row >= col)
                    System.out.print(y);
            }

          //  for (k = 1; k <= i * 2 - 1; k++){
          //      System.out.print((char)(alphabet + k ));


        System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here

/**
 * The following lines of Code have been taken from the Internet |
 * https://beecoder.org/de/java/create-pyramid-and-pattern-in-java, last visit: 14.10.2022
 */

        int ROWS = 6, k = 0;

        for (int i = 1; i <= ROWS; ++i, k=0) {
            for (int space = 1; space <= ROWS - i; ++space) {
                System.out.print(" ");
            }

        while (k != 2 * i - 1){
            System.out.print("*");
            ++k;
        }

        System.out.println();

        }


    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here

/**
 * The following lines of Code have been taken from the Internet |
 * https://www.tutorialgateway.org/java-program-to-print-diamond-alphabets-pattern/, last visit: 14.10.2022
 */

        Scanner scan = new Scanner(System.in);

        System.out.print("h:");
        System.out.print("c:");

        int ROWS = scan.nextInt();
        int i, j, k, alphabet = 64;

        for (i = 1; i <= ROWS; i++){
            for (j = 1; j <= ROWS-i; j++){
                System.out.print(" ");
            }

        for (k = 1; k <= i * 2 - 1; k++){
            System.out.print((char)(alphabet + k));
        }
        System.out.println();
        }

        for (i = ROWS - 1; i > 0; i--){
            for (j = 1; j <= ROWS - i; j++){
                System.out.print(" ");
            }
        for (k = 1; k <= i * 2 - 1; k++){
            System.out.print((char)(alphabet + k ));
        }
        System.out.println();
        }
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