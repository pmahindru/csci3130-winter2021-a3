package ca.dal.cs.csci3130.a3.q3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {

    public int getPrice() {
        return 20;
    }

    public Date getExpiredDate() {
        Date expired = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
            expired = sdf.parse("2021-03-31");
        } catch (Exception exc) {
            System.err.println("Incorrect date format!");
        }
        return expired;
    }

    public int getWeight() {
        return 1;
    }

    public boolean isPerishable() {
        return true;
    }

    public boolean isFarmProduct() {
        return true;
    }

}
