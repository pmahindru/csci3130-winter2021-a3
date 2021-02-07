package ca.dal.cs.csci3130.a3.q4;

public class LoyaltyCard {

    static int MINIMUM_POINTS;
    int currentPoints;

    public LoyaltyCard(int points) {
        this.currentPoints = points;
    }

    public boolean cashIn(int points2Cash) {
        if (this.currentPoints < MINIMUM_POINTS) {
            notifyCardHolder("Failed to cash in due to low points!");
            return false;
        } else {
            if (points2Cash > this.currentPoints) return false;
            this.currentPoints = this.currentPoints - points2Cash;
            return true;
        }
    }

    public boolean transfer(LoyaltyCard anotherCard) {
        if (this.currentPoints < MINIMUM_POINTS) {
            notifyCardHolder("Failed to transfer due to low points!");
            return false;
        } else {
            //transferring points to another card
            anotherCard.currentPoints = this.currentPoints;
            this.currentPoints = 0;
            return true;
        }
    }

    public boolean buyProduce(int pointsForProduce) {
        if (this.currentPoints < MINIMUM_POINTS) {
            notifyCardHolder("Failed to buy produce due to low points!");
            return false;
        } else {
            //buying produce with loyalty points
            if (this.currentPoints < pointsForProduce) return false;
            this.currentPoints = this.currentPoints - pointsForProduce;
            return true;
        }
    }

    public void setMinimumPoints(int minimumPoints) {
        MINIMUM_POINTS = minimumPoints;
    }

    protected void notifyCardHolder(String message) {
        System.out.println("Message:" + message);
    }

}
