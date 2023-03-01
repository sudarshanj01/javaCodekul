package strings;

//it is mutable
//it has no synchronised methods
//it is more powerful

public class StringBuilderDemo {
    public static void main(String[] args) {

        String str="pune";
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());
        stringBuilder.append(" And Mumbai");
        System.out.println(stringBuilder);



    }
}
