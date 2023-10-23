package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;

    Warehouse warehouse = new Warehouse();

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
        "salary=" + salary +
        " , isPayed=" + isPayed +
                " } ";
    }

    @Override
    public void doWork() {
            salary = salary + 80;
            warehouse.incrementPickedOrders();
            System.out.println(salary);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("No Bonuses");
            return;
        }
        if(isPayed){
            System.out.println("Bonus was already payed");
            return;
        }

        salary = salary + 70000;
        isPayed = true;


    }
    }

