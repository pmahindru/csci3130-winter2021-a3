package ca.dal.cs.csci3130.a3.q2;

public class Buyer implements AppUser {
    public static AccessLevel buyerAccessLevel = new AccessLevel("buyer");

    public AccessLevel getUserRole(){
        return buyerAccessLevel;
    }

    public boolean canPlaceOnlineOrder(AccessLevel accessLevel) {
        return true;
    }

    public boolean canPlaceOnlineAd(AccessLevel accessLevel) {
        return false;
    }

    public boolean hasAdminAccess(AccessLevel accessLevel) {
        return false;
    }


}
