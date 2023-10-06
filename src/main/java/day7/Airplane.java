package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info(){
        System.out.println("Изготовитель: " + manufacturer + " год выпуска: " +year+" длина: " + length + " вес: " + weight + " количество топлива в баке: " );
    }



    public static void compareAirplanes(Airplane airplane, Airplane airplane1){
        if(airplane.length > airplane1.length){
            System.out.println(" Airplane 1 is longer");
        }else if (airplane.length < airplane1.length){
            System.out.println("Airplane 2 is longer");
        }else {
            System.out.println("Airplanes lengths are equal");
        }

    }
}
