/**
 * This class represents the abstract class Users.
 * @author emilywells.
 * @version 1.0.
 * Here you can make changes to the variables that make up a user for the app system. 
 */
public class Users {
	  /**
	   * Instance variables for a user. 
	   */
	  private final int userID;
	  private final String firstName;
	  private final String lastName;
	  private final String password;

	  // The constructor (setting the data):
	  /**
	   * Create a user with specified the parameters.
	   * @param userID_.
	   * @param firstName_.
	   * @param lastName_.
	   * @param password_.
	   */
	  public Users(final int userID_, final String firstName_, final String lastName_, final String password_) {
	    if (userID_ <= 0) {
	      userID = -1; firstName = "FAULT"; lastName = "FAULT"; password = "FAULT";
	    }
	    else {
	      userID = userID_;
	      firstName = firstName_;
	      lastName = lastName_;
	      password = password_;
	    }
	  }

	  // The methods:
	  /**
	   * These methods return the instance variables of a user.
	   * @return the users first name.
	   * @return the users last name.
	   * @return the users ID.
	   * @return the users password.
	   */
	  public int get_userID() { return userID; }
	  public String get_firstName() { return firstName; }
	  public String get_lastName() { return lastName; }
	  public String get_password() { return password; }
	    
	  /**
	   * These methods allow the user to set their details. 
	   * @param userID the new ID component.
	   * @param firstName the new first name component.
	   * @param lastName the new last name component.
	   * @param password the new password component.
	   */
	  public void set_userID(int userID) { userID = this.userID; }
	  public void set_firstName(String firstName) { firstName = this.firstName; }
	  public void set_lastName(String lastName) { lastName = this.lastName; }
	  public void set_password(String password) { password = this.password; }
	  
	  /**
	   * This method allows the user to login. However this is specified in the specific user class, for example a staff member login, and customer login.
	   */
	  public void login() {
		  return;
	  }
	  
	  
	  
	  /*public  String retrieveProfile(int ID){
	      if(userID == ID){
	    	  return Users.firstName + " " + Users.lastName + " " + ID;
	      }
	      else{
	          return "Error: invalid ID";
	      }
	  }*/
	  // "toString" is a standardised name (in a sense -- actually it
	  // "overrides" the (empty) method as it comes in the automatic
	  // "base class" Object):
	  public String toString() {
	    return "userID=" + userID + ", name=\"" + firstName + " " + lastName;
	  }

	  // A function for creating many user-objects:
	 /* public static Users[] factory(final int[] userIDs, final String[] firstNames, String[] lastNames) {
	    if (userIDs == null || firstNames == null || userIDs.length != firstNames.length || lastNames == null || userIDs.length != lastNames.length)
	      return null;
	    final int N = userIDs.length;
	    Users[] result = new Users[N];
	    for (int i = 0; i < N; ++i)
	      result[i] = new Users(userIDs[i], firstNames[i], lastNames[i]);
	    return result;
	  }*/

}
