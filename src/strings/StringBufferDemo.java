package strings;

//it has synchronised methods
//it is mutable

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer("pune");

        stringBuffer.append("mumbai");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.indexOf("m"));
        System.out.println(stringBuffer.reverse());


    }
}
