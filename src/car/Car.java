package car;

public abstract class Car {
    private String model;
    private String color;
    private short maxSpeed;
    public byte wheelCount;


    public Car(String model, String color, short maxSpeed,byte wheelCount) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.wheelCount = wheelCount;
    }

    public abstract void gas();

    public abstract int getWheelCount();

    public void display() {
        System.out.println("model: " + model);
        System.out.println("color: " + color);
        System.out.println("max speed: " + maxSpeed);
    }



}
