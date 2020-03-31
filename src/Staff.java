package sample;

/**
 * This is a subclass of User. It is for the Staff using the system.
 * @author Emily Wells.
 * @version 1.0.
 */
public class Staff extends User {

    /**
     * This is the constructor for a staff object
     * @param userID_
     * @param firstName_
     * @param lastName_
     */
    public Staff(final int userID_, final String firstName_, final String lastName_){
        super(userID_, firstName_, lastName_);
    }

    /**
     * This allows a staff member to log into the system with a valid userID.
     * @param userID
     * @return
     * @Override User login().
     */
    public boolean login(int userID) {
        //TO DO: if the ID is in the database it returns true, else if returns false
        return false;
    }

    /**
     * This returns the order, specified, that has been placed.
     * @param orderID
     */
    public void /*String[]*/ getOrderInformation(int orderID){
        //TO DO amend with reference to orders class
        return;
    }
}
