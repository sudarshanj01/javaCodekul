package operators;

/**
 * arithmetic -> +,-,*,/,%
 * boolean -> true false
 * ternary -> ? :
 * logical - && , || NOT
 * bitwise - & |
 * unary -> post increment a++,pre increment ++a,--a,a--
 * relational -> < > ,<= ,>=
 * assignment -> = ==
 * shift -> << ,>>
 */

public class Operators {

    public static void main(String[] args) {
        int i =10;
        int j=10;
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i/j);
        System.out.println(i*j);
        System.out.println(i%j);

        System.out.println(i++); //i = i + 1
        System.out.println(i);

        System.out.println(i--);//i = i - 1
        System.out.println(i);

        System.out.println(++i); //i+1 = i
        System.out.println(--i); //i-1 = i
        System.out.println(i<j);
        System.out.println(i>j);
        System.out.println(i>=j);

        System.out.println(i<<2);//i*2^2 = 10*4=40
        System.out.println(i>>2);//i/2^2 = 10/4s=2

        System.out.println(i&j);
        System.out.println(i|j);

        String ot = i>0 || j>0?"both are not zero":"we are in else loop ";
        System.out.println(ot);


    }
}
