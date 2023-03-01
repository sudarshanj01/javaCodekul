package abstraction;

//abstraction - hiding details and showing functionality
public class Football implements Sport1,Sport2{
    @Override

    public void play(){

        System.out.println("in football");
    }
    public static void main (String[] argument){
        Football fobj=new Football();
        fobj.play();
    }
}



