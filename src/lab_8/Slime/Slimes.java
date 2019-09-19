package lab_8.Slime;

import lab_8.Mob;

public class Slimes implements Mob {
    String name;

    @Override
    public void Run() {
        int speed = 70;
        System.out.println("Run");
    }

    @Override
    public void Punch() {
        int damage = 700;
        System.out.println("Punch");
    }


    @Override
    public int Swim() {
        int air = 100;
        return 100;
        //System.out.println("Swim");
    }

    @Override
    public void Fly() {
        int time = 0;
        System.out.println("Fly");
    }

    @Override
    public int Jump() {
        int jump = 1;
        return 1;
        //System.out.println("Jump");
    }

    @Override
    public void Hp() {
        int hp = 15000;
        System.out.println("Hp");
    }

    @Override
    public void Shoot() {

    }
}
