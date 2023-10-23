package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    double magicalAttack = 15;
    public Shaman() {
        physAtt = 10;
        physDef = 0.8;
        magicDef = 0.8;

    }

    @Override
    public void healHimself() {
        if(health > 100){
            health = 100;
        }
        health = health + 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health >100){
            health = 100;
        }
        hero.health = health + 30;

    }

    @Override
    public void magicalAttack(Hero hero) {

        double magAttScore = magicalAttack *(1 - hero.magicDef);
        if(hero.health - magAttScore < 0){
            hero.health = 0;
        }else{
            hero.health -= (int) magAttScore;
        }
        System.out.println(magAttScore);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
