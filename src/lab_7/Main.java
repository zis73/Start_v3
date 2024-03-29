package lab_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<BasicPay> list = new ArrayList<BasicPay>();
        list.add(new HourlyPayment("Oleg", 20.0));
        list.add(new HourlyPayment("Stas", 36.0));
        list.add(new HourlyPayment("Igor", 30.0));
        list.add(new FixedPayment("Alex", 35000.3));
        list.add(new FixedPayment("Maks", 33000.2));
        list.add(new FixedPayment("Yra", 63000.1));

        System.out.println("Before:");
        for (BasicPay elem : list) {
            System.out.println(elem.getName() + ": " + elem.getSalary());
            elem.GetSalary();
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
