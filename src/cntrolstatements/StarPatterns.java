package cntrolstatements;

public class StarPatterns {

    public static void main(String[] args) {

        //1)star rectangle pattern

//        for (int i=1;i<=5;i++){
//           for (int j=1;j<=5;j++){
//               System.out.print(" *");
//           }
//            System.out.println();
//        }


        //2)Right Triangle Star Pattern

//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }


//        3)pyramid star pattern

        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }










    }
}