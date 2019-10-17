package diplom.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static diplom.main.Store.NewProduct;
import static diplom.main.Store.scan;

public class ScanInfo {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private String color;
    private int price;
    private int amount;

    public ScanInfo(/*String name, String color, int price, int amount*/) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String setName() throws IOException {
        System.out.println("Введите название:");
        this.name = reader.readLine();
        return name;
    }

    public String getColor() {
        return color;
    }

    public String setColor() throws IOException {
        System.out.println("Введите цвет:");
        this.color = reader.readLine();
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice() throws IOException {
        System.out.println("Введите цену:");
        String text = reader.readLine();
        if (isInteger(text)) {
            this.price = Integer.parseInt(text);
            if (price < 1) {
                System.out.println("Цена не может быть меньше 0");
                setPrice();
            }
        }else{
            setPrice();
        }
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int setAmount() throws IOException {
        System.out.println("Введите кол-во:");
        String text = reader.readLine();
        if (isInteger(text)) {
            this.amount = Integer.parseInt(text);
            if (amount < 1) {
                System.out.println("Цена не может быть меньше 0");
                setAmount();
            }
        }else{
            setAmount();
        }
        return amount;
    }

    static boolean isInteger(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Введите числа!");
            return false;
        }
    }
    public void hereWeGoAgain() throws IOException {
        System.out.println("Хотите добавить еще? да/нет");
        if (reader.readLine().equalsIgnoreCase("да")){
            NewProduct(new Telephone(scan.setName(), scan.setColor(),scan.setPrice(),scan.setAmount()));
        }
    }
    
}
