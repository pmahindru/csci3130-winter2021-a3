package ca.dal.cs.csci3130.a3.q2;

public class Admin {
    public static AccessLevel adminAccessLevel = new AccessLevel("admin");

    public AccessLevel getUserRole(){
        return adminAccessLevel;
    }

    public boolean canPlaceOnlineOrder(AccessLevel accessLevel) {
        return true;
    }

    public boolean canPlaceOnlineAd(AccessLevel accessLevel) {
        return true;
    }

    public boolean hasAdminAccess(AccessLevel accessLevel) {
        return true;
    }
}
