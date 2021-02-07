package ca.dal.cs.csci3130.a3;

import org.junit.Test;
import ca.dal.cs.csci3130.a3.q4.LoyaltyCard;
import static org.junit.Assert.*;

public class LoyaltyCardTest {

    @Test
    public void testCashIn(){
        LoyaltyCard card=new LoyaltyCard(1000);
        card.setMinimumPoints(500);
        assertTrue(card.cashIn(600));
        assertFalse(card.cashIn(500));
    }

    @Test
    public void testTransfer(){
        LoyaltyCard card=new LoyaltyCard(500);
        card.setMinimumPoints(400);
        LoyaltyCard anotherCard=new LoyaltyCard(0);
        assertTrue(card.transfer(anotherCard));
        assertFalse(card.transfer(anotherCard));
    }

    @Test
    public void testBuyProduce(){
        LoyaltyCard card=new LoyaltyCard(400);
        card.setMinimumPoints(500);
        assertFalse(card.buyProduce(300));
        LoyaltyCard secondCard=new LoyaltyCard(1000);
        secondCard.transfer(card);
        assertTrue(card.buyProduce(600));
    }

}
