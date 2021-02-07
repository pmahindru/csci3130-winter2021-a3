package ca.dal.cs.csci3130.a3.q5;

public class Customer {

    private String firstName;
    private String lastName;
    private PhoneNumber unformattedNumber;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(PhoneNumber unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFormattedPhoneNumber() {
        String formattedNumber = new String();
        formattedNumber = this.unformattedNumber.getAreaCode() + "-" + this.unformattedNumber.getPrefix() +
                "-" + this.unformattedNumber.getNumber();
        return formattedNumber;
    }
}
