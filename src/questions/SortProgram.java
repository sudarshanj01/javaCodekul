package questions;

public class SortProgram {

    public static void main(String[] args) {

        int[] arr ={3764,374,45,5456,3,45,1};
        int temp=0;


       for (int i=0; i< arr.length; i++){//for descending order
           for (int j=i+1; j< arr.length; j++){
               if (arr[i] < arr[j]){//swap values if first element is lesser than another
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;

               }
           }
       }


        System.out.println();

        System.out.println("array in descending order");
        for (int  i= 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////

        for (int a=0; a< arr.length; a++){//for ascending order
            for (int b=a+1; b< arr.length; b++){
                if (arr[a] > arr[b]){//swap values if first element is lesser than another
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;

                }
            }
        }


        System.out.println();

        System.out.println("array in ascending order");
        for (int  a= 0;  a< arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

    }

}

