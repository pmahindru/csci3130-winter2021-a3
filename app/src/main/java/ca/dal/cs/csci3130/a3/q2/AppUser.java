package ca.dal.cs.csci3130.a3.q2;

public interface AppUser {
    public boolean canPlaceOnlineOrder(AccessLevel accessLevel);

    public boolean canPlaceOnlineAd(AccessLevel accessLevel);

    public boolean hasAdminAccess(AccessLevel accessLevel);

}