package L19_UnitTesting.rpg_lab;

public interface Target {
    int getHealth();

    void takeAttack(int attackPoints);

    int giveExperience();

    boolean isDead();
}