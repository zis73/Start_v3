package lab_interface;

import lab_interface.Level.Swimpool;
import lab_interface.Level.Wall;
import lab_interface.Robot.Droid;
import lab_interface.Robot.Robot;

public class Main {
    public static void main(String[] args) {
        Droid droid = new Droid("C3PO");
       // droid.Punch();
        System.out.println("Level:1");
        Wall wall = new Wall(14);
        wall.doIt();
        System.out.println("--------------");
        System.out.println("Level:2");
        Swimpool swimpool = new Swimpool(9);
        swimpool.doIt();
    }
}
