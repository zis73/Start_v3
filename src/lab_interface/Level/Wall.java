package lab_interface.Level;

import lab_interface.Animal.Tiger;
import lab_interface.Mob;
import lab_interface.Obstracle;
import lab_interface.Robot.Droid;
import lab_interface.Robot.Robot;
import lab_interface.Slime.BigSlime;
import lab_interface.Teams;

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
