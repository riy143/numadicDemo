package Browser;

import org.testng.annotations.Test;

import POM.Applicationform;
import utiity.utility;

public class Testclass1  extends Baseclass{
	
	
	@Test 
	public void ApplicationForm() {
		
		Applicationform applicationform = new Applicationform(driver);
		
		utility ut = new utility();
		test =extent.createTest("appliiaation form fill up");
		applicationform.firstname();
		applicationform.lastname();
		applicationform.Email();
		applicationform.mobile();
		applicationform.city();
		//applicationform.None();
		
		applicationform.country();
		applicationform.curretnemploy();
		applicationform.none2();
		applicationform.skillset();
		applicationform.currentctc();
		applicationform.expectedctc();
		
		applicationform.noticeperiod();
		applicationform.reasonforchange();
		applicationform.whynumadic();
		applicationform.state();
		applicationform.Street();
		//ut.enterScript(applicationform.browsefile());
		//ut.imageUpload(applicationform.browsefile(),"C:\\Users\\rajku\\eclipse-workspace\\N\\resume");
		applicationform.submit();
		
		extent.flush();
		
		
		
	}

}
