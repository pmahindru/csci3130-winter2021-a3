package ca.dal.cs.csci3130.a3;

public class Bus {
    final int NUMBER_OF_WHEELS = 4;
    final int AVERAGE_KM_PER_HOUR = 60;

    public int getNumberOfWheels() {
        return NUMBER_OF_WHEELS;
    }

    public void honk() {
        System.out.println("The bus is honking!");
    }

    public boolean carryPassengers() {
        return true;
    }

    public int getAverageSpeed() {
        return AVERAGE_KM_PER_HOUR;
    }

}
