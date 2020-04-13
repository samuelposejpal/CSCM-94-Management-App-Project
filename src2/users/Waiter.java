package users;

/**
 * This class represents a Waiter for the restaurant and addititional functionality.
 * @author Emily Wells.
 * @version 1.0.
 */
public class Waiter extends Staff{

    /**
     * This is the constructor for a staff object
     *
     * @param userID_
     * @param firstName_
     * @param lastName_
     */
    public Waiter(int userID_, String firstName_, String lastName_, double hoursWorked_, double hoursToWork_) {
        super(userID_, firstName_, lastName_, hoursWorked_, hoursToWork_);
    }

    /**
     * Method to approve a customer booking.
     * @param orderID
     * @return
     */
    public boolean approveTableBooking(int orderID){
        boolean available = true;
        return available;
    }

    /**
     * Method to approve an order.
     * @param orderID
     * @return
     */
    public boolean approveDeliveryRequest(int orderID) {
        boolean available = true;
        return available;
    }

    //TODO
    public void createOrder() {
        return;
    }

    //TODO
    public void markOrderComplete(){
        return;
    }

}
