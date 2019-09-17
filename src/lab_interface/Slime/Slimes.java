package lab_interface.Slime;

import lab_interface.Mob;

public class Slimes implements Mob {
    String name;
    @Override
    public void Run(int speed) {
        speed = 70;
        System.out.println("Run");
    }

    @Override
    public void Punch(int damage) {
        damage = 700;
        System.out.println("Punch");
    }

    @Override
    public void Swim(int air) {
        air = 100;
        System.out.println("Swim");
    }

    @Override
    public void Fly(int time) {
        time = 0;
        System.out.println("Fly");
    }

    @Override
    public void Jump(int jump) {
        jump = 1;
        System.out.println("Jump");
    }

    @Override
    public void Hp(int hp) {
        hp = 15000;
        System.out.println("Hp");
    }

    @Override
    public void Shoot(int range) {

    }
}
