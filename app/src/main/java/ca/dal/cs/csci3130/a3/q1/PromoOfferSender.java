package ca.dal.cs.csci3130.a3.q1;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PromoOfferSender {
    public void sendOffer(IPromoOffer offer) {
        String expiredDateString = offer.getExpiredDate();
        Date expiredDate = convertToDate(expiredDateString);

        Date date = Calendar.getInstance().getTime();

        if (date.before(expiredDate)) {
            String offerDetails = offer.getOffer();
            //details code for sending the offer
            System.out.println("\t" + offerDetails + "\n\t" + expiredDate);
        }
    }

    //for the date thing i took from here https://www.codegrepper.com/code-examples/java/how+to+convert+string+to+date+object+in+java
    // just to make sure that how they change the date from string to date.

    @SuppressLint("SimpleDateFormat")
    public Date convertToDate(String dateString) {
        Date convertedDate = null;
        try {
            convertedDate = new SimpleDateFormat("yyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //convert the date string to a date class!
        return convertedDate;
    }

}
