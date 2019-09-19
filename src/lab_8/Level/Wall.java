package lab_8.Level;

import lab_8.Animal.Tiger;
import lab_8.Obstracle;
import lab_8.Robot.Droid;
import lab_8.Slime.BigSlime;

public class Wall implements Obstracle {
    int height;
    Droid droid = new Droid("C3PO");
    Tiger tiger = new Tiger("Ширхан");
    BigSlime bigSlime = new BigSlime("Chaki");

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt() {
        if (droid.Jump() >= height) {
            System.out.println("Droid win!");
        }
        if (tiger.Jump() >= height) {
            System.out.println("Ширхан перепрыгнул!");
        }
        if (bigSlime.Jump() <= height) {
            System.out.println("К сожалению, слизняки не прыгают");
        }
    }
}
