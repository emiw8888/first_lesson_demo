package car;

public class Kia extends Car{
    public Kia(String model, String color, short maxSpeed,byte wheelCount) {
        super(model, color, maxSpeed,wheelCount);
    }


    @Override
    public void gas() {
        System.out.println("kia is moving...");
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }
}
