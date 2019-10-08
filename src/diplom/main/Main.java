package diplom.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        NewProduct();
//        Purchase();
        SaleReport();
    }

    public static void NewProduct() throws IOException {
        System.out.println("Введите продукт");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Добавлен новый продукт");
        System.out.println(name);
    }

    public static void Purchase /*покупка*/() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество телефонов");
        String amount = reader.readLine();
        System.out.println("Введите стоимость телефона");
        String price = reader.readLine();
        System.out.println(amount);
        System.out.println(price);

    }

    public static void SaleReport/*отчет*/() {
        ArrayList product = new ArrayList();
        product.add(0,"Simens");
        System.out.println(product);
    }
}
