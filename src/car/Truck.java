package car;

public class Truck extends Car {
    private final int weightCapacity;

    public Truck(String model, String color, short maxSpeed,byte wheelCount, int weightCapacity) {
        super(model, color, maxSpeed,wheelCount);
        this.weightCapacity = weightCapacity;
    }

    @Override
    public void gas() {
        System.out.println("Truck is moving...");
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    public int getWeightCapacity(){
        return weightCapacity;
    }

}
