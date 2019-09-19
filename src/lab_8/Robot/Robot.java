package lab_8.Robot;

import lab_8.Mob;

public class Robot implements Mob {
    String name;
    float charge;

    @Override
    public void Run() {
        int speed = 160;
        System.out.println("Run");
    }

    @Override
    public void Punch() {
        int damage = 1600;
        System.out.println("Punch: " + damage);
    }

    @Override
    public int Swim() {
        int air = 0;
        return 0;
        //System.out.println("Swim");
    }

    @Override
    public void Fly() {
        int time = 280;
        System.out.println("Fly");
    }

    @Override
    public int Jump() {
        int jump = 15;
        return 15;
        //System.out.println("Jump");
    }

    @Override
    public void Hp() {
        int hp = 10000;
        System.out.println("Hp");
    }

    @Override
    public void Shoot() {

    }
}
