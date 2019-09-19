package lab_8.Animal;

import lab_8.Mob;

public class Animal implements Mob {
    String name;
    int age;

    @Override
    public void Run() {
        int speed = 450;
        System.out.println("Run");
    }

    @Override
    public void Punch() {
        int damage = 1350;
        System.out.println("Punch");
    }

    @Override
    public int Swim() {
        int air = 10;
        return 10;
        //System.out.println("Swim");
    }

    @Override
    public void Fly() {
        int time = 0;
        System.out.println("Fly");
    }

    @Override
    public int Jump() {
        int jump = 17;
        return 17;
        // System.out.println("Jump");
    }

    @Override
    public void Hp() {
        int hp = 7000;
        System.out.println("Hp");
    }

    @Override
    public void Shoot() {

    }
}
