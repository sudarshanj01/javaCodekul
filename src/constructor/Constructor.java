package constructor;
/**
 * Constructor - it is special type of function which execute when you create object of class
 * rule -
 *
 * 1.your function should be class name
 * 2.there is no explicit return type
 * 3.final,static,synchronized keyword are not allowed
 *
 * types of constructor - parameter constructor
 * default constructor
 */

public class Constructor {

    public  Constructor(){                  //default constructor
        System.out.println("In constuctor (Default)");
    }
    public Constructor(int i){                  //paramersied constuctor
        System.out.println("Number passed in construtor is "+i);
    }

    public static void main(String[] args) {
        Constructor object=new Constructor(7);
    }
}
