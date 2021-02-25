package ca.dal.cs.csci3130.a3.q2;

public class Seller {
    public static AccessLevel sellerAccessLevel = new AccessLevel("seller");

    public AccessLevel getUserRole(){
        return sellerAccessLevel;
    }

    public boolean canPlaceOnlineOrder(AccessLevel accessLevel) {
        return false;
    }

    public boolean canPlaceOnlineAd(AccessLevel accessLevel) {
        return true;
    }

    public boolean hasAdminAccess(AccessLevel accessLevel) {
        return false;
    }
}
