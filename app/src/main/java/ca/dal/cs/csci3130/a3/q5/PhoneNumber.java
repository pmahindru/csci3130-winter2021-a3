package ca.dal.cs.csci3130.a3.q5;

public class PhoneNumber {
    String unformattedNumber;

    public PhoneNumber(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }

    protected String getAreaCode() {
        return this.unformattedNumber.substring(0, 3);
    }

    protected String getPrefix() {
        return this.unformattedNumber.substring(3, 6);
    }

    protected String getNumber() {
        return this.unformattedNumber.substring(6, 10);
    }

}
