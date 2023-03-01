package encapsulation;

public class Encapsulation {

    private int id;

    private String name;
    private String Address;

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
//        obj.id = 1;
//        obj.name = "sudarshan";
//        obj.Address = "pune";
        obj.setId(36432);
        obj.setAddress("pune");
        obj.setName("sudarshan");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String str2) {
        Address = str2;
    }
}
