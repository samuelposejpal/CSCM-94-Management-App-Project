/**
 * Delivery Driver class to create a Delivery Driver object and extra functionality of the Delivery Driver.
 * @author Emily Wells
 */
package users;


public class DeliveryDriver extends Staff {
    /**
     * This is the constructor for a staff object
     *
     * @param userID_
     * @param firstName_
     * @param lastName_
     */
    public DeliveryDriver(int userID_, String firstName_, String lastName_, double hoursWorked_, double hoursToWork_) {
        super(userID_, firstName_, lastName_, hoursWorked_, hoursToWork_);
    }

    /**
     * This returns a customer address for delivery purposes.
     * @param userID
     * @return
     */
    public String getAddress(int userID){
        String address = Customer.get_address(userID);
        return address;
    }
}
