/**
 * User class to create a User object and functionality of all users.
 * @author Emily Wells
 */
package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the abstract class to create a user of the system. Superclass to Staff and Customer.
 * @author Emily Wells.
 * @version 1.0.
 */
public abstract class User {

    /**
     * Instance variables for a user.
     */
    protected static int userID;
    protected static String firstName;
    protected static String lastName;
    protected static String address;

    // The constructor (setting the data):
    /**
     * Create a user with specified the parameters.
     * @param userID_, firstName_, lastName_.
     */
    public User(final int userID_, final String firstName_, final String lastName_) {
        if (userID_ <= 0) {
            userID = -1; firstName = "FAULT"; lastName = "FAULT";;
        }
        else {
            userID = userID_;
            firstName = firstName_;
            lastName = lastName_;
        }
    }

    /**
     * Abstract method to update a current user in the database.
     */
    public abstract void updateUserInDB() throws SQLException;

    /**
     * Abstract method to insert a new user in the database.
     */
    public abstract void insertUserInDB() throws SQLException;

    /**
     * Method to delete user from the database.
     */
    public static void deleteProfile(int userId) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        int userID = User.get_userID();
        try {
            //Connect to the Database.
            Class.forName("com.mysql . jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhoast:3306/RestaurantDB", "root", "6Ylime93");

            //create a string that holds the user query with 'X' as user inputs.
            String sql = "DELETE FROM UserProfile WHERE ID = ' "+userID+" ' ";

            //prepare the query
            preparedStatement = con.prepareStatement(sql);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
        finally {
            if (con != null) con.close();
            if (preparedStatement != null) preparedStatement.close();
        }
    }
    // The methods:
    /**
     * These methods return the instance variables of a user.
     * @return the user userID.
     */
    public static int get_userID() { return userID; }

    /**
     * For changing the address of a customer.
     * @param address
     */
    public void set_address(String address) { address = User.address;}

    /**
     * For retrieving the address of a customer.
     */
    public String get_address() { return address;}

    /**
     * These methods return the instance variables of a user.
     * @return the user first name.
     */
    public String get_firstName() { return firstName; }

    /**
     * These methods return the instance variables of a user.
     * @return the user last name.
     */
    public String get_lastName() { return lastName; }

    /**
     * These methods allow the user to set their details.
     * @param firstName the new ID component.
     */
    public void set_firstName(String firstName) { firstName = this.firstName; }

    /**
     * These methods allow the user to set their details.
     * @param lastName the new ID component.
     */
    public void set_lastName(String lastName) { lastName = this.lastName; }

    /**
     * This method allows the user to login. However this is specified in the specific user class, for example a staff member login, and customer login.
     * @overide login
     */
    public abstract boolean login(int userID);

    // "toString" is a standardised name (in a sense -- actually it
    // "overrides" the (empty) method as it comes in the automatic
    // "base class" Object):
    public String toString() {
        return "userID=" + userID + ", name=\"" + firstName + " " + lastName;
    }
}

