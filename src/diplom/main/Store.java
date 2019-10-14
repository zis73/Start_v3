package diplom.main;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Store {
    static ArrayList<Telephone> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        NewProduct(new Telephone("yotaPhone", "pink", 123000, 12));
        NewProduct(new Telephone("myPhone", "pink", 12000, 12));

    }

    public static void NewProduct(Telephone telephone) throws IOException {
        //list.add(telephone);
        ScanInfo scan = new ScanInfo();
        if (list.size() == 0 /*&& telephone.price != 0*/) {
            list.add(telephone);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(telephone.name) && list.get(i).color.equals(telephone.color)) {
                list.get(i).amount += telephone.amount;
            } else {
                list.add(telephone);
            }
            System.out.println(list.get(i).name + " " + list.get(i).color + " " + list.get(i).price + " " + list.get(i).amount);
        }
    }

    public static void Purchase /*покупка*/() throws IOException {

    }

    public static void SaleReport/*отчет*/() {

    }

    public static void Product() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите продукт");
        String name = reader.readLine();
        String price = reader.readLine();
        String amount = reader.readLine();
    }

}
