package diplom.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanInfo {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private String color ;
    private int price;
    private int amount;
    public ScanInfo(String name,String color, int price, int amount) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
    public void  setName() throws IOException {
        this.name = reader.readLine();
    }
    public String getColor(){
        return color;
    }
    public void setColor() throws IOException {
        this.color = reader.readLine();
    }
    public int getPrice(){
        return price;
    }
    public void setPrice() throws IOException {
        this.price = Integer.parseInt(reader.readLine());
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount() throws IOException {
        this.amount = Integer.parseInt(reader.readLine());
    }
}
