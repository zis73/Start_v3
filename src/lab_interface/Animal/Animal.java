package lab_interface.Animal;

import lab_interface.Mob;

public class Animal implements Mob {
    String name;
    int age;
    @Override
    public void Run(int speed) {
        speed = 450;
        System.out.println("Run");
    }

    @Override
    public void Punch(int damage) {
        damage = 1350;
        System.out.println("Punch");
    }

    @Override
    public void Swim(int air) {
        air = 10;
        System.out.println("Swim");
    }

    @Override
    public void Fly(int time) {
        time = 0;
        System.out.println("Fly");
    }

    @Override
    public void Jump(int jump) {
        jump = 17;
        System.out.println("Jump");
    }

    @Override
    public void Hp(int hp) {
        hp = 7000;
        System.out.println("Hp");
    }

    @Override
    public void Shoot(int range) {

    }
}
