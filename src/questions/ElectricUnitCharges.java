package questions;

import java.util.Scanner;

public class ElectricUnitCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the electric units: ");
        double units = input.nextDouble();

        double bill;

        if (units <= 50) {
          bill=units*0.5;
        } else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units < 250){
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        }else{
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }


        double surcharge=bill*0.2;
        bill=bill+surcharge;

        System.out.println("Your Electricity Bill is "+bill+" rupees");

    }
}
