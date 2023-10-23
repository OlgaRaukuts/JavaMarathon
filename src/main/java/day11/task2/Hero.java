package day11.task2;

public abstract class Hero implements PhysAttack{

     int health;
     double physDef;
     double magicDef;
     int physAtt;

    public Hero() {
        health = 100;
    }

        @Override
        public void physicalAttack(Hero hero) {
        double physAttScore = physAtt *(1 - hero.physDef);
        if(hero.health - physAttScore < 0){
            hero.health = 0;
        }else{
            hero.health = (int) (hero.health - physAttScore);
        }
        System.out.println(physAttScore);

    }

}
