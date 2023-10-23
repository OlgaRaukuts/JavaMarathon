package day11.task2;

public class Magician extends Hero implements MagicAttack{
    int magicAttack = 20;
    public Magician() {
        physDef =0;
        magicDef = 0.8;
        physAtt =5;
    }

    @Override
    public void magicalAttack(Hero hero) {
            double magAttScore = magicAttack *(1 - hero.magicDef);
            if(hero.health - magAttScore < 0){
                hero.health = 0;
            }else{
                hero.health -= (int) magAttScore;
            }
            System.out.println(magAttScore);

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
