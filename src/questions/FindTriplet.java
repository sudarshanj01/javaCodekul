package questions;
//find three numbers having addition 18

public class FindTriplet {

    void find3Numbers(int A[], int arr_size, int sum) {

        for (int i = 0; i < arr_size - 2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);

                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        FindTriplet triplet = new FindTriplet();
        int A[] = {17, 24, 29, 8, 7, 3};
        int sum = 18;
        int arr_size = A.length;

        triplet.find3Numbers(A, arr_size, sum);
    }
}
