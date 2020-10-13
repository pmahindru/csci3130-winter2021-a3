package ca.dal.cs.csci3130.a3;

public class Truck {

    final int NUMBER_OF_WHEELS = 4;
    final int AVERAGE_KM_PER_HOUR = 80;

    public int getNumberOfWheels() {
        return NUMBER_OF_WHEELS;
    }

    public void honk() {
        System.out.println("The truck is honking!");
    }

    public boolean carryPassengers() {
        return false;
    }

    public boolean carryGoods() {
        return true;
    }

    public int getAverageSpeed() {
        return AVERAGE_KM_PER_HOUR;
    }
}
