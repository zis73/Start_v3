package lab_8;

import lab_8.Animal.Tiger;
import lab_8.Robot.Droid;
import lab_8.Slime.BigSlime;

public class Teams {
    Droid droid = new Droid("Droid");
    Tiger tiger = new Tiger("Tiger");
    BigSlime bigSlime = new BigSlime("BigSlime");
    Mob[] team = {tiger, droid, bigSlime};

}
