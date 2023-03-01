package keywords_in_java.thiskeyword;

/**
 *
 * 1. this keyword is used to refer current class instance variable
 * 2.it is used to reffer curent class method
 * 3.this is used to call current class constructor
 * 4.this is uded to pass arguemnt or parameter as in method
 *
 */
public class ThisKeywordDemo {

    int id;
    String name;
    String address;

    public ThisKeywordDemo(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ThisKeywordDemo(){
        this(1,"om","pune");
    }

    public void show(A a){
        System.out.println("in show");
    }



    @Override
    public String toString() {
        return "ThisKeywordDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo(1,"sudarshan","Pune");
        System.out.println(obj);
    }
}

class A {
    int i = 10;



    public void display() {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.show(this);

    }

    public static void main(String[] args) {
        A obj=new A();
        obj.display();
    }
}