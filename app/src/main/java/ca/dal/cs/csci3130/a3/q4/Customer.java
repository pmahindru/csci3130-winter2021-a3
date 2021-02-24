package ca.dal.cs.csci3130.a3.q4;

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

    public String getFormattedPhoneNumber() {
        return unformattedNumber.getFormattedPhoneNumber();
    }

    public String getFullName(Customer customer) {
        return customer.firstName + " " + customer.lastName;
    }
}
