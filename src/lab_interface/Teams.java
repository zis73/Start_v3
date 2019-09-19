package lab_interface;

import lab_interface.Animal.Animal;
import lab_interface.Animal.Tiger;
import lab_interface.Robot.Droid;
import lab_interface.Slime.BigSlime;

public class Teams {
    Droid droid = new Droid("Droid");
    Tiger tiger = new Tiger("Tiger");
    BigSlime bigSlime = new BigSlime("BigSlime");
    Mob[] team = {tiger, droid, bigSlime};

}
