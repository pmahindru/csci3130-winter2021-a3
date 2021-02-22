package ca.dal.cs.csci3130.a3.q3;

public class Vegetable extends Product {
    @Override
    public int getPrice() {
        return 5;
    }
    public boolean isPerishable() {
        return true;
    }
    public boolean isProducedInAFarm() {
        return true;
    }
}
