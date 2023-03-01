package access_specifiers;

//here we have accessed the object of Test1 class
//in first class we have used protected ASpe.
public class Test2 {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }
}