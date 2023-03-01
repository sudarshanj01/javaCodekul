package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Employee {
      int id;
      String name;
      String Address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public static void main(String[] args) {

        List<Employee> employee =new ArrayList<>();

        Employee emp1=new Employee(1,"sudarshan","pune");
        Employee emp2=new Employee(2,"sudarshan","pune");
        Employee emp3=new Employee(3,"sudarshan","pune");

        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);



        employee.forEach(s -> {
            System.out.println("id-"+s.id+" name-"+s.getName()+" address-"+s.getAddress());
        });


    }
}
