package collection_framework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Product {

    int id,price,quantity;
    String name;

    public Product(int id, int price, int quantity, String name) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        Product fan=new Product(1,3000,10,"fan");
        Product tv=new Product(2,40000,10,"tv");
        Product adaptor=new Product(3,500,10,"adaptor");

        ArrayList<Product> ProductList=new ArrayList<>();
        ProductList.add(fan);
        ProductList.add(tv);
        ProductList.add(adaptor);

        for (int i=0; i<10; i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter what product do you want to buy tv ,adaptor or fan");
            String item=scanner.next();

            if (item.equals("tv") || item.equals("fan") || item.equals("adaptor")){
                System.out.println("Thanks for buying "+item);
            }

            if(item.equals(tv.getName())){
                tv.quantity--;
            } else if (item.equals(fan.getName())) {
                fan.quantity--;
            } else if (item.equals(adaptor.getName())) {
                adaptor.quantity--;
            } else {
                System.out.println("Sorry Entered product is not available");
            }

            System.out.println();
            System.out.println("Product Records");
            ProductList.forEach(s->{
                System.out.println("Id:"+s.getId()+" name:"+s.getName()+" price:"+s.getPrice() +" "
                        +"Remaining Quantity : "+s.getQuantity());
            });
            System.out.println();
        }
    }
}
