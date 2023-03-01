package cntrolstatements;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1,num2;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        num1= sc.nextInt();

        System.out.println("Enter another number ");
        num2= sc.nextInt();

        System.out.println("enter opearation which you want to perform e.g: + , - , * , / ");
        char operation = sc.next().charAt(0);

        if (operation =='+'){
            System.out.println(num1+num2);
        } else if (operation == '-') {
            System.out.println(num1-num2);
        }
        else if (operation == '*') {
            System.out.println(num1 * num2);
        }
        else if (operation == '/') {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println(" Enter a correct operation");
        }
    }

}
