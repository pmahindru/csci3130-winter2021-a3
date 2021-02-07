package ca.dal.cs.csci3130.a3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Date;
import ca.dal.cs.csci3130.a3.q2.IPromoOffer;
import ca.dal.cs.csci3130.a3.q2.PromoOfferSender;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.Silent.class)
public class PromoOfferSenderTest {

    static IPromoOffer offer = null;

    @Test
    public void testSendOffer() {
        PromoOfferSender sender = new PromoOfferSender();
        sender.sendOffer(offer);
        assertEquals("This is a cool offer!", offer.getOffer());
        assertEquals("2021-03-31", offer.getExpiredDate());
        Mockito.verify(offer, Mockito.atLeastOnce()).getExpiredDate();
        Mockito.verify(offer, Mockito.atLeastOnce()).getOffer();
    }

}
