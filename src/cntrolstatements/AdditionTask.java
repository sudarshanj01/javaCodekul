package cntrolstatements;

import java.util.Scanner;

public class AdditionTask {

    public static void main(String[] args) {
        int num,sum=0;
        char choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter a number ");

            num = sc.nextInt();
            sum =sum +num;


            System.out.println("addtion is" + sum);

            System.out.println("dou u want to continue y or n");
            choice = sc.next().charAt(0);

        }while (choice=='y' || choice=='Y');
        System.out.println(" Final addtion is" + sum);



    }
}
