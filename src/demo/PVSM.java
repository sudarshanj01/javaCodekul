package demo;
//public - access modifier/specifier
//static - without creating object of class jvm is accessing main function
// void - main function is nothing return
// main- it is identifier
//String[] - command line argument for main function
//    args- variable name
public class PVSM {
    public static String show() {
        System.out.println("hello");
        return "string";
    }

    private static void play() {
        System.out.println("helo");
    }

    public static void main(String[] args) {
           PVSM object = new PVSM();
           object.show();



            play();
        }



}

