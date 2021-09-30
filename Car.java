class Vehicle {
    private String regNo = null;

    public Vehicle(String no) {
        this.regNo = no;
    }
}
public class Car extends Vehicle {
    private String brand = null;

    public Car(String br, String no) {
        super(no);
        this.brand = br;
    }
}

