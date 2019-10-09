package diplom.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Telephone {
    public static void main(String[] args) throws IOException {
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));
        //Telephone();
    }
    public static void Telephone() throws IOException {
        ArrayList<String> product = new ArrayList<>();
        ArrayList<String> productList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String price = reader.readLine();
        String amount = reader.readLine();
        product.add(name);
        product.add(price);
        product.add(amount);
        System.out.println(product);
    }
}
