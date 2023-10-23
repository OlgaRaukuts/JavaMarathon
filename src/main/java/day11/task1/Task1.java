package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse w1 = new Warehouse();
        Picker picker = new Picker(w1);
        Courier courier = new Courier(w1);

        businessProcess(courier);
        System.out.println(courier);
        System.out.println(w1);

        businessProcess(courier);
        System.out.println(w1);

        businessProcess(picker);
        System.out.println(picker);
        System.out.println(w1);

        Warehouse w2 = new Warehouse();
        Picker picker2 = new Picker(w2);
        Courier courier2 = new Courier(w2);

        picker2.doWork();
        courier2.doWork();

        System.out.println(picker);
        System.out.println(courier);

    }

    static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }

        worker.bonus();
    }

}
