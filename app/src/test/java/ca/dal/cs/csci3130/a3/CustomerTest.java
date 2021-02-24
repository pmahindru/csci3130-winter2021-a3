package ca.dal.cs.csci3130.a3;

import org.junit.Test;
import ca.dal.cs.csci3130.a3.q4.Customer;
import ca.dal.cs.csci3130.a3.q4.PhoneNumber;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CustomerTest {

    @Test
    public void testCustomerName() {
        Customer firstCustomer = new Customer("John", "Doe");
        assertEquals("John Doe", firstCustomer.getFullName(firstCustomer));

        Customer secondCustomer = new Customer("Jane", "Doe");
        assertEquals("Jane Doe", secondCustomer.getFullName(secondCustomer));
    }

    @Test
    public void testCustomerPhone() {
        PhoneNumber phoneNumber1 = new PhoneNumber("3062568956");
        Customer customer1 = new Customer(phoneNumber1);
        assertEquals("306-256-8956", customer1.getFormattedPhoneNumber());

        PhoneNumber phoneNumber2 = new PhoneNumber("9023567894");
        Customer customer2 = new Customer(phoneNumber2);
        assertNotEquals("9023567894", customer2.getFormattedPhoneNumber());
    }

}
