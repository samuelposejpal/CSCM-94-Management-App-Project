/**
 *  Manager class to create a Manager object and extra functionality of the Manager.
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
 * This is the Manager class, a subclass of staff.
 * @author Emily Wells.
 * @version 1.0.
 */

public class Manager extends Staff{

    /**
     * This is the constructor for a manager object.
     * @param userID_
     * @param firstName_
     * @param lastName_
     */
    public Manager(final int userID_, final String firstName_, final String lastName_, double hoursToWork_, double hoursWorked_){
        super(userID_, firstName_, lastName_, hoursToWork_, hoursWorked_);
    }

    /**
     * This function allows a manager to create a new staff profile and it is added to the database.
     * @param userID_
     * @param firstName_
     * @param lastName_
     */
    public void createStaffMember(final int userID_, final String firstName_, final String lastName_, double hoursToWork_, double hoursWorked_){
        Staff newMember = new Staff(userID_, firstName_, lastName_, hoursToWork_, hoursWorked_);
    }

    /**
     * This method will write the instance of the customer into the database.
     * @throws SQLException
     */
    public void insertStaffIntoDB() throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            //Connect to the Database.
            Class.forName("com.mysql . jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhoast:3306/RestaurantDB", "root", "6Ylime93");

            //create a string that holds the user query with 'X' as user inputs.
            String sql = "INSERT INTO UserProfile (userID, firstName, lastName)" + "VALUES (x, x, x)";

            //prepare the query
            preparedStatement = con.prepareStatement(sql);

            //bind the values to the parameters
            preparedStatement.setString(1, String.valueOf(userID));
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);

            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (con != null) con.close();
            if (preparedStatement != null) preparedStatement.close();
        }

    }

    /**
     * This method will update a staff members details in the database.
     * @throws SQLException
     */
    public void updateStaffInDB() throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            //Connect to the Database.
            Class.forName("com.mysql . jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhoast:3306/RestaurantDB", "root", "6Ylime93");

            //create a string that holds the user query with 'X' as user inputs.
            String sql = "UPDATE user SET firstName = x, lastName = x" + "WHERE ID = x";

            //prepare the query
            preparedStatement = con.prepareStatement(sql);

            //bind the values to the parameters
            preparedStatement.setString(1, String.valueOf(userID));
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (con != null) con.close();
            if (preparedStatement != null) preparedStatement.close();
        }
    }

    /**
     * This method will delete a staff member from the database.
     *
     */
    public void deleteProfile() throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            //Connect to the Database.
            Class.forName("com.mysql . jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhoast:3306/RestaurantDB", "root", "6Ylime93");

            //create a string that holds the user query with 'X' as user inputs.
            String sql = "DELETE FROM UserProfile" + "WHERE ID = x";

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

    /**
     * This function allows a manager to generate a report for the specified date and time period.
     * @param sDate_
     * @param eDate_
     * @return
     */
    //TODO un comment the functions that are called from 'reports' once reports is completed
    //manager can request reports
    private String requestReport(final int sDate_, final int eDate_){
        Report period = new Report(sDate_, eDate_);
        return "Most active customer: " /*+ mostActiveCustomer(period) */+ " Most popular item: " /*+ mostPopularItem(period)*/;

        //TODO complete the rest with SQL code, and remove void
    }

    /**
     * This function allows a manager to generate a reoprt for the specified date period.
     * @param sDate_
     * @param eDate_
     * @return
     */
    //manager can request reports
    private String requestReport(final int sDate_, final int eDate_, final int sTime_, final int eTime_){
        Report period = new Report(sDate_, eDate_, sTime_, eTime_);
        return "Most active customer: " /*+ mostActiveCustomer(period) */+ " Most popular item: " /*+ mostPopularItem(period)*/;
        //TODO complete the rest with SQL code, and remove void
    }

    /**
     * This class represents the Customer with a first and last name, user ID and address.
     * @author Emily Wells.
     * @version 1.0.
     */
    public static class Customer extends User {

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
         * This method will write the instance of the customer into the database.
         * @throws SQLException
         */
        public void insertUserInDB() throws SQLException {
            Connection con = null;
            PreparedStatement preparedStatement = null;
            int id = get_userID();

            try {
                //Connect to the Database.
                Class.forName("com.mysql . jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhoast:3306/RestaurantDB", "root", "6Ylime93");

                //create a string that holds the user query with 'X' as user inputs.
                String sql = "INSERT INTO UserProfile (firstName, lastName, address)" + "WHERE ID = id AND UserType = Customer" + "VALUES (x, x, x)";

                //prepare the query
                preparedStatement = con.prepareStatement(sql);

                //bind the values to the parameters
                preparedStatement.setString(1, String.valueOf(userID));
                preparedStatement.setString(2, firstName);
                preparedStatement.setString(3, lastName);
                preparedStatement.setString(4, address);

                preparedStatement.executeUpdate();

            } catch (SQLException | ClassNotFoundException e) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                if (con != null) con.close();
                if (preparedStatement != null) preparedStatement.close();
            }

        }

        /**
         * This method will update the customer details in the database.
         * @throws SQLException
         */
        public void updateUserInDB() throws SQLException {
            Connection con = null;
            PreparedStatement preparedStatement = null;

            try {
                //Connect to the Database.
                Class.forName("com.mysql . jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RestaurantDB", "root", "6Ylime93");

                //create a string that holds the user query with 'X' as user inputs.
                String sql = "UPDATE user SET firstName = x, lastName = x, address = x" + "WHERE ID = x AND UserType = Customer";

                //prepare the query
                preparedStatement = con.prepareStatement(sql);

                //bind the values to the parameters
                preparedStatement.setString(1, String.valueOf(userID));
                preparedStatement.setString(2, firstName);
                preparedStatement.setString(3, lastName);
                preparedStatement.setString(4, address);

                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException | ClassNotFoundException e) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                if (con != null) con.close();
                if (preparedStatement != null) preparedStatement.close();
            }
        }

        /**
         * Returns past orders of a customer.
         */
        public void /*String[]*/ getPastOrders(){
            //TODO need to implement with order methods
        }

        /**
         * Returns past bookings of a customer.
         */
        public void /*String[]*/ getPastBookings(){
            //TODO need to implement with booking class
        }

        /**
         * Returns future bookings of a customer.
         */
        public void /*String[]*/ getFutureBookings(){
            //TODO need to implement with booking class
        }




    }
}
