package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password= new StringBuilder(username).reverse().toString();
        boolean correctGuess = false;
        byte counter = 0;
        for (int i = 0; i < 4 ; i++) {
            counter++;
            String guess = scanner.nextLine();
            if (guess.equals(password)){
                correctGuess = true;
                System.out.printf("User %s logged in.", username );
                break;
            }
            else {
                if (counter == 4){
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
                continue;
            }
        }

    }
}
