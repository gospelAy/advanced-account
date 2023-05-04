package Except;

import java.util.Scanner;

public class TryExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter any number of your choice! ");
            int choice = input.nextInt();

            System.out.println(choice);
        }catch (Exception e){
            System.out.println("please kindly enter a number");
        }
    }
}
