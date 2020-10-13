package ca.dal.cs.csci3130.a3;

public class Dog {

    public static final String HUSKY = "HUSKY";
    public static final String BULLDOG = "BULLDOG";
    public static final String DALMATIAN = "DALMATIAN";

    private String dogType;

    public Dog(String dogType) {
        this.dogType = dogType;
    }

    public int getSpeed() {
        int dogSpeed = 0;
        switch (dogType) {
            case Dog.BULLDOG:
                dogSpeed = getBaseSpeed();
                break;
            case Dog.DALMATIAN:
                dogSpeed = getBaseSpeed() + getExtraByTraining() + getExtraByBodyShape();
                break;
            case Dog.HUSKY:
                dogSpeed = getBaseSpeed() + getExtraByTraining() +
                        getExtraByBodyShape() - getSlowerDueToIce();
                break;
        }
        return dogSpeed;
    }

    protected int getBaseSpeed() {
        return 15;
    }

       protected int getExtraByTraining() {
        return 10;
    }

    protected int getExtraByBodyShape() {
        return 12;
    }

    protected int getSlowerDueToIce() {
        return 9;
    }

}
