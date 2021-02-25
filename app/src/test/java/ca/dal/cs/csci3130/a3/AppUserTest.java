package ca.dal.cs.csci3130.a3;

import org.junit.Test;

import ca.dal.cs.csci3130.a3.q2.AccessLevel;
import ca.dal.cs.csci3130.a3.q2.Admin;
import ca.dal.cs.csci3130.a3.q2.AppUser;
import ca.dal.cs.csci3130.a3.q2.Buyer;
import ca.dal.cs.csci3130.a3.q2.Seller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AppUserTest {
    @Test
    public void testBuyerAccess() {
        /*only constructor can be modified*/
        Buyer appUser = new Buyer();
        AccessLevel accessLevel = appUser.getUserRole();
        assertTrue(appUser.canPlaceOnlineOrder(accessLevel));
        assertFalse(appUser.hasAdminAccess(accessLevel));
    }

    @Test
    public void testSellerAccess() {
        /*only constructor can be modified*/
        Seller appUser = new Seller();
        AccessLevel accessLevel = appUser.getUserRole();
        assertTrue(appUser.canPlaceOnlineAd(accessLevel));
        assertFalse(appUser.hasAdminAccess(accessLevel));
    }

    @Test
    public void testAdminAccess() {
        /*only constructor can be modified*/
        Admin appUser = new Admin();
        AccessLevel accessLevel = appUser.getUserRole();
        assertTrue(appUser.hasAdminAccess(accessLevel));
        assertTrue(appUser.canPlaceOnlineAd(accessLevel));
        assertTrue(appUser.canPlaceOnlineOrder(accessLevel));
    }

}
