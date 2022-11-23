package Browser;

import org.testng.annotations.Test;

import POM.Home;

public class Testclass extends Baseclass {
	@Test
	public void verifytext() {
		Home home = new Home (driver);
		test=extent.createTest("test1");
		test.info("abbas");
		home.e();
		test.info("abbas");
		home.jobs();
		test.info("abbas");
		home.QA();
		home.numadictitle();
		test.info("abbas");
		home.iaminterested();
	extent.flush();
	}
	/*@Test
	public void Application(){
	applicationform.city();
	applicationform.None();
	applicationform.firstname();
	applicationform.lastname();
	applicationform.country();
	applicationform.Email();
	applicationform.currentctc();
	applicationform.mobile();
	applicationform.none2();
	applicationform.noticeperiod();
	applicationform.reasonforchange();
	applicationform.skillset();
	applicationform.state();
	applicationform.Street();
	}*/
}
