/**
 * Chef class to create a chef object and extra functionality of the chef.
 * @author Emily Wells
 */
package users;

/**
 * This class represents a Chef for the restaurant.
 * @author Emily Wells.
 * @version 1.0.
 */
public class Chef extends Staff {
    /**
     * This is the constructor for a staff object
     *
     * @param userID_
     * @param firstName_
     * @param lastName_
     */
    public Chef(int userID_, String firstName_, String lastName_) {
        super(userID_, firstName_, lastName_);
    }

    /**
     * This allows the chef to mark an order as complete.
     * @param orderID
     * @return
     */
    public boolean markOrderComplete(int orderID){
        return true;
    }

    /**
     * This allows the Chef to edit the menu by adding a 'special'.
     * @param name
     */
    public void addDailySpecial(String name){
        //TO DO add to database system
        return;
    }
}
