package day11.task1;

public class Courier implements Worker{
    private double salary;
    public boolean isPayed;
    Warehouse warehouse = new Warehouse();

    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + salary +
                " , isPayed=" + isPayed +
                " } ";
    }

    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.incrementDeliveredOrders();
        System.out.println(salary);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("No Bonuses");
        }
        if(isPayed){
            System.out.println("Bonus was already payed");
            return;
        }
        salary = salary + 50000;
        isPayed = true;
    }
}
