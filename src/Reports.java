/**
 * This class represents the construction of reports time/date period
 * @author emilywells
 * @version 1.0
 */
public class Reports {
	// The instance variables:

	  /*private final int period;*/
	  private final int sDate;
	  private final int eDate;
	  private final int eTime;
	  private final int sTime;
	    

	  // The constructor for date AND time (setting the data):
	  public Reports (final int sDate_, final int eDate_, final int sTime_, final int eTime_) {
		  /*this.period = 0;*/
	      sDate = sDate_;
	      eDate = eDate_;
	      sTime = sTime_;
	      eTime = eTime_;
	  }
	  //constructor for just date 
	  public Reports (final int sDate_, final int eDate_) {
		  /*this.period = 0;*/
		  this.sTime = 0;
		  this.eTime = 0;
	      sDate = sDate_;
	      eDate = eDate_;
	  }

	  /*/ The methods:
	  public mostPopularItem(Reports period){
	      
	  }
	  
	  public busiestPeriod(Reports period){
	      
	  }
	  
	  public mostHoursWorked(Reports period){
		  
	  }
      
	  public int mostActiveCustomer(Reports period) {
		  
	  }*/
}
