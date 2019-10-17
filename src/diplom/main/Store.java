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

    public static void main(String[] args) throws IOException {
        CallMethods();
    }

    public static void NewProduct(Telephone telephone) throws IOException {
        //list.add(telephone);

        if (list.size() == 0 /*&& telephone.price != 0*/) {
            list.add(telephone);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(telephone.name) && list.get(i).color.equals(telephone.color)) {
                list.get(i).amount += telephone.amount;
            } else {
                list.add(telephone);
            }
            System.out.println(list.get(i).name + " " + list.get(i).color + " " + list.get(i).price + " " +
                    list.get(i).amount);
        }
        CallMethods();
        //scan.hereWeGoAgain();
    }


    public static void Purchase /*покупка*/() throws IOException {
        boolean hasPhone = false;
        int indx = 0;
        /*for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).name.equals(scan.setName()) ||
               (list.get(i).name.equals(scan.setName()) && !list.get(i).color.equals(scan.setColor()))){
                //System.out.println("Такого телефона нет,введите заново");
                //Purchase();
            }else {
                list.get(i).amount -= scan.setAmount();
                System.out.println("В наличии осталость:" + list.get(i).amount);
            }
        }*/
        String currName = scan.setName();
        String currColor = scan.setColor();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(currName) && list.get(i).color.equals(currColor)) {
                hasPhone = true;
                indx = i;
                break;
            }
        }
        if (hasPhone) {
            list.get(indx).amount -= scan.setAmount();
        } else {
            System.out.println("Такого телефона нет,введите заново");
            Purchase();
        }

        CallMethods();
    }

    public static void SaleReport/*отчет*/() {

    }

    public static void Stock() throws IOException {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).color + " " + list.get(i).price + " " +
                    list.get(i).amount);
        }

        CallMethods();
    }

    public static void CallMethods() throws IOException {

        System.out.print("-|New product|-|Purchase|-|Store|-|Sale Report|-|Quit|-" + '\n' + "Введите запрос:");
        String method = reader.readLine();
        switch (method) {
            case "New product":
                NewProduct(new Telephone(scan.setName(), scan.setColor(), scan.setPrice(), scan.setAmount()));
                break;
            case "Sale Report":
                SaleReport();
                break;
            case "Purchase":
                Purchase();
                break;//передавать название, цвет
            case "Store":
                Stock();
            case "Quit":
                break;
        }
    }
}
//for (int i = 0; i < list.size(); i++) {
//        if (!list.get(i).name.equals(telephone.name) && !list.get(i).color.equals(telephone.color)) {
//        System.out.println("Такого телефона нет на складе");
//        }
//        if (list.get(i).name.equals(telephone.name) && list.get(i).color.equals(telephone.color)
//        && list.get(i).amount > 0) {
//        //telephone.amount = telephone.amount - list.get(i).amount;
//        list.get(i).amount -= telephone.amount;
//        }
//        }