package questions;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = input.nextDouble();

        double hra;
        double da;

        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross salary of the employee: " + grossSalary);
    }
}

