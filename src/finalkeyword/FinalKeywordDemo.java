package finalkeyword;

public class FinalKeywordDemo {

        final int i =10;



    public static void main(String[] args) {

        FinalKeywordDemo obj =new FinalKeywordDemo();
//        obj.i=20;//give error because of final keyword
        System.out.println(obj.i);
    }

}
