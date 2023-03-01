package questions;

public class Palindrome {
    public static void main(String[] args) {
        String str ="sudarshan";
        String reverse="";

        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i)+reverse;
        }

        System.out.println(str);
        System.out.println(reverse);

        if(str == reverse){
            System.out.println("string is palindrome");
        }else {
            System.out.println("string is not palindrome");
        }


        }
    }

