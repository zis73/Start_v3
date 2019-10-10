package diplom.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Telephone {
    String name;
    String color;
    int price;
    int amount;

    public Telephone(String name, String color, int price, int amount) {
        this.name = name;//super(name,color,price,amount);
        this.color = color;
        this.price = price;
        this.amount = amount;
    }
}
//public static void Telephone() throws IOException {
//        ArrayList<String> product = new ArrayList<>();
//        ArrayList<String> productList = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        String price = reader.readLine();
//        String amount = reader.readLine();
//        product.add(name);
//        product.add(price);
//        product.add(amount);
//        System.out.println(product);
//    }