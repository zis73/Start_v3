package lab_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<BasicPay> list = new ArrayList<BasicPay>();
        list.add(new HourlyPayment("Oleg", 70));
        list.add(new HourlyPayment("Stas", 56));
        list.add(new HourlyPayment("Igor", 30));
        list.add(new FixedPayment("Alex", 35000));
        list.add(new FixedPayment("Maks", 33000));
        list.add(new FixedPayment("Yra", 63000));

        System.out.println("Before:");
        for (BasicPay elem : list) {
            System.out.println(elem.getName() + ": " + elem.getSalary());
        }
        Collections.sort(list, new Comparator<BasicPay>() {
            @Override
            public int compare(BasicPay t0, BasicPay t1) {
                return t0.getSalary().compareTo(t1.getSalary());
            }
        });
        System.out.println("-------------");
        System.out.println("After:");
        for (BasicPay elem : list) {
            System.out.println(elem.getName() + ": " + elem.getSalary());
        }
    }
}
