package diplom.main;

import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Store {
    static ArrayList<Telephone> list = new ArrayList<>();
    static ScanInfo scan = new ScanInfo();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int purchaseSum = 0;

    public static void main(String[] args) throws IOException {
        CallMethods();
    }

    public static void NewProduct(Telephone telephone) throws IOException {
        if (list.size() == 0) {
            list.add(telephone);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).name.equals(telephone.name) && list.get(i).color.equals(telephone.color)) {
                    list.get(i).amount += scan.getAmount();
                } else {
                    list.add(telephone);
                    break;
                }
            }
        }
        CallMethods();
        //scan.hereWeGoAgain();
    }

    public static void Purchase /*покупка*/() throws IOException {
        boolean hasPhone = false;
        int indx = 0;

        String currName = scan.setName();
        String currColor = scan.setColor();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(currName) && list.get(i).color.equals(currColor)) {
                hasPhone = true;
                indx = i;
                purchaseSum += list.get(i).amount * list.get(i).price;
                break;
            }
        }
        if (hasPhone) {
            list.get(indx).amount -= scan.setAmount();
            if (list.get(indx).amount <= 0) {
                list.remove(indx);
            }
        } else {
            System.out.println("Такого телефона нет,введите заново");
            Purchase();
        }
        CallMethods();
    }

    public static void SaleReport/*отчет*/() throws IOException {
        System.out.println(purchaseSum);
        CallMethods();
    }

    public static void Stock() throws IOException {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).color + " " + list.get(i).price + " " +
                    list.get(i).amount);
        }

        CallMethods();
    }

    public static void CallMethods() throws IOException {
        try {
            System.out.print("-|New product|-|Purchase|-|Store|-|Sale Report|-|Quit|-" + '\n' + "Введите запрос:");
            String method = reader.readLine();
            switch (method) {
                case "New product":
                    NewProduct(new Telephone(scan.setName(), scan.setColor(), scan.setPrice(), scan.setAmount()));
                    break;
                case "Sale report":
                    SaleReport();
                    break;
                case "Purchase":
                    Purchase();
                    break;
                case "Store":
                    Stock();
                case "Quit":
                    break;
            }
        } catch (IllegalArgumentException a) {
            a.printStackTrace();
        }
    }
}
