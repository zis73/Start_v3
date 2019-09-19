package lab_8.Level;

import lab_8.Animal.Tiger;
import lab_8.Obstracle;
import lab_8.Robot.Droid;
import lab_8.Slime.BigSlime;

public class Swimpool implements Obstracle {
    int width;
    Droid droid = new Droid("C3PO");
    Tiger tiger = new Tiger("Ширхан");
    BigSlime bigSlime = new BigSlime("Chaki");

    public Swimpool(int width) {
        this.width = width;
    }

    @Override
    public void doIt() {
        if (droid.Swim() <= width) {
            System.out.println("Дроид заржавел");
        }
        if (tiger.Swim() >= width) {
            System.out.println("Киска стала мокрой");
        }
        if (bigSlime.Swim() >= width) {
            System.out.println("Слизь переплыла препятсвие");
        }
    }
}
