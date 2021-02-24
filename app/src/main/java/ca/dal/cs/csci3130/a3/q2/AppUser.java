package ca.dal.cs.csci3130.a3.q2;

public class AppUser {
    public static AccessLevel buyerAccessLevel = new AccessLevel("buyer");
    public static AccessLevel sellerAccessLevel = new AccessLevel("seller");
    public static AccessLevel adminAccessLevel = new AccessLevel("admin");

    String userType;

    public AppUser(String userType) {
        this.userType = userType;

    }

    public AccessLevel getUserRole()
    {
        AccessLevel userAccessLevel = null;
        switch (this.userType) {
            case "buyer":
                userAccessLevel = getBuyerAccessLevel();
                break;

            case "seller":
                userAccessLevel = getSellerAccessLevel();
                break;

            case "admin":
                userAccessLevel = getAdminAccessLevel();
                break;
        }
        return userAccessLevel;
    }

    public AccessLevel getBuyerAccessLevel() {
        return buyerAccessLevel;
    }

    public AccessLevel getSellerAccessLevel() {
        return sellerAccessLevel;
    }

    public AccessLevel getAdminAccessLevel() {
        return adminAccessLevel;
    }

    public boolean canPlaceOnlineOrder(AccessLevel accessLevel) {
        if (accessLevel.equals(AppUser.buyerAccessLevel)) {
            return true;
        } else if (accessLevel.equals(AppUser.adminAccessLevel)) {
            return true;
        }
        return false;
    }

    public boolean canPlaceOnlineAd(AccessLevel accessLevel) {
        if (accessLevel.equals(AppUser.sellerAccessLevel)) {
            return true;
        } else if (accessLevel.equals(AppUser.adminAccessLevel)) {
            return true;
        }
        return false;
    }

    public boolean hasAdminAccess(AccessLevel accessLevel) {
        if (accessLevel.equals(AppUser.adminAccessLevel)) {
            return true;
        }
        return false;
    }
}

//class buyer extends AppUser{
//    public buyer(String userType) {
//        super(userType);
//    }
//
//    AccessLevel getUserRole(){
//        return getBuyerAccessLevel();
//    }
//}
//
//class seller extends AppUser{
//    public seller(String userType) {
//        super(userType);
//    }
//
//    AccessLevel getUserRole(){
//        return  getSellerAccessLevel();
//    }
//}
//
//class admin extends AppUser{
//    public admin(String userType) {
//        super(userType);
//    }
//
//    AccessLevel getUserRole(){
//        return getAdminAccessLevel();
//    }
//}
