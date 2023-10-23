package day11.task2;

public class Paladin extends Hero implements Healer{
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + 25 > 100){
            health = 100;
        }
        health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health +20 > 100){
            hero.health = 100;
        }
        hero.health += 20;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
