package lab_interface;

public interface Mob {
    void Run(int speed);

    void Punch(int damage);

    void Swim(int air);

    void Fly(int time);

    void Jump(int jump);

    void Hp(int hp);

    void Shoot(int range);
}
