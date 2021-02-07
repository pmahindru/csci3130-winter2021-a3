package ca.dal.cs.csci3130.a3.q3;

public class Vegetable extends Product {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public boolean isFarmProduct() {
        return false;
    }
}
