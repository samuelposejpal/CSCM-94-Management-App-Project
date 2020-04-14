/**
 * Customer class to create a Customer object and extra functionality of the Customer.
 * @author Emily Wells
 */
package users;

import java.sql.SQLException;

/**
 * This class represents the Customer with a first and last name, user ID and address.
 * @author Emily Wells.
 * @version 1.0.
 */
public class Customer extends User {
    private static String address;

    /**
     * Create a customer object with an ID, name and address.
     * @param userID_
     * @param firstName_
     * @param lastName_
     * @param address_
     */
    public Customer(final int userID_, final String firstName_, final String lastName_, final String address_){
        super(userID_, firstName_, lastName_);
        address = address_;
    }

    /**
     * Login using user ID. if the ID exists in the system then user is granted access.
     * @param userID
     * @return boolean
     */
    @Override
    public boolean login(int userID){
        int ID = this.get_userID();
        return ID == userID;
    }

    /**
     * For changing the address of a customer.
     * @param address
     */
    public void set_address(String address) { address = Customer.address;}

    /**
     * For retrieving the address of a customer.
     * @param userID
     * @return
     */
    public static String get_address(int userID) { return address;}

    @Override
    public void updateUserInDB() throws SQLException {

    }

    @Override
    public void insertUserInDB() throws SQLException {

    }

    /**
     * For deleting a customer profile.
     * @param userID
     */
    public static void deleteProfile(int userID){
        //TO DO need to implement SQL code
    }

    /**
     * Returns past orders of a customer.
     */
    public void /*String[]*/ getPastOrders(){
        //TO DO need to implement with order methods
    }

    /**
     * Returns past bookings of a customer.
     */
    public void /*String[]*/ getPastBookings(){
        //TO DO need to implement with booking class
    }

    /**
     * Returns future bookings of a customer.
     */
    public void /*String[]*/ getFutureBookings(){
        //TO DO need to implement with booking class
    }
}
