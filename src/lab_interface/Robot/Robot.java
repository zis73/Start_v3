package lab_interface.Robot;

import lab_interface.Mob;

public class Robot implements Mob {
    String name;
    float charge;

    @Override
    public void Run(int speed) {
        speed = 160;
        System.out.println("Run");
    }

    @Override
    public void Punch() {
       int  damage = 1600;
        System.out.println("Punch: " + damage);
    }

    @Override
    public void Swim(int air) {
        air = 0;
        System.out.println("Swim");
    }

    @Override
    public void Fly(int time) {
        time = 280;
        System.out.println("Fly");
    }

    @Override
    public void Jump(int jump) {
        jump = 15;
        System.out.println("Jump");
    }

    @Override
    public void Hp(int hp) {
        hp = 10000;
        System.out.println("Hp");
    }

    @Override
    public void Shoot(int range) {

    }
}
