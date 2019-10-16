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
