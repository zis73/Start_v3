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
        NewProduct(new Telephone("myPhone", "pink", 123000, 12));
//        Purchase();
//        SaleReport();
//        Product();
    }

    public static void NewProduct(Telephone telephone) throws IOException {
        //Telephone telephone = new Telephone("Iphone", "black", 45000, 360);
       // Telephone iphone = new Telephone("Iphone20", "asd", 123000, 12);
        //list.add(telephone);

        if (list.size() == 0 && telephone.price != 0) {
            list.add(telephone);
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).name.equals(telephone.name) && list.get(i).color.equals(telephone.color)) {
                list.get(i).amount += telephone.amount;
            } else {
                list.add(telephone);
            }

            System.out.println(list.get(i).name + " " + list.get(i).color +
                    " " + list.get(i).price + " " + list.get(i).amount);
        }
    }


    //        for (int i = 0; i < list.size(); i++) {
//            list.get(i).name.equals(telephone.name);
//            list.get(i).amount += telephone.amount;
//        }
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
