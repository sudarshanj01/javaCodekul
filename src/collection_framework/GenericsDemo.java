package collection_framework;

public class GenericsDemo<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsDemo<Integer> obj=new GenericsDemo<>();
        obj.setT(1);
        obj.setT(2);

        System.out.println(obj.getT());
    }
}
