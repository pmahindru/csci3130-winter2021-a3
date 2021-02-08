package ca.dal.cs.csci3130.a3;

import org.junit.Test;

import ca.dal.cs.csci3130.a3.q2.AccessLevel;
import ca.dal.cs.csci3130.a3.q2.AppUser;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AppUserTest {
    @Test
    public void testBuyerAccess() {
        /*only constructor can be modified*/
        AppUser appUser = new AppUser("buyer");
        AccessLevel accessLevel = appUser.getUserRole();
        assertTrue(appUser.canPlaceOnlineOrder(accessLevel));
        assertFalse(appUser.hasAdminAccess(accessLevel));
    }

    @Test
    public void testSellerAccess() {
        /*only constructor can be modified*/
        AppUser appUser = new AppUser("seller");
        AccessLevel accessLevel = appUser.getUserRole();
        assertTrue(appUser.canPlaceOnlineAd(accessLevel));
        assertFalse(appUser.hasAdminAccess(accessLevel));
    }

    @Test
    public void testAdminAccess() {
        /*only constructor can be modified*/
        AppUser appUser = new AppUser("admin");
        AccessLevel accessLevel = appUser.getUserRole();
        assertTrue(appUser.hasAdminAccess(accessLevel));
        assertTrue(appUser.canPlaceOnlineAd(accessLevel));
        assertTrue(appUser.canPlaceOnlineOrder(accessLevel));
    }

}
