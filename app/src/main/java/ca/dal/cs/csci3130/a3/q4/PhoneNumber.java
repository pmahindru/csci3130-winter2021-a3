package ca.dal.cs.csci3130.a3.q4;

public class PhoneNumber {
    private final String unformattedNumber;

    public PhoneNumber(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }

    private String getString(int x, int y) {
        return this.unformattedNumber.substring(x, y);
    }

    protected String getAreaCode() {
        return getString(0, 3);
    }

    protected String getPrefix() {
        return getString(3, 6);
    }

    protected String getNumber() {
        return getString(6, 10);
    }

    protected String getFormattedPhoneNumber() {
        String formattedNumber = "";
        formattedNumber = getAreaCode() + "-" + getPrefix() +
                "-" + getNumber();
        return formattedNumber;
    }
}
