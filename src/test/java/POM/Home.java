package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

		@FindBy (xpath = "//*[text()='JOIN OUR CREW']")
		private WebElement e;

		@FindBy (xpath = "(//a[@href='javascript:void(0)'])[1]")
		private WebElement jobs;

		@FindBy (xpath = "//*[text()='QA Engineer']")
		private WebElement QA;
		
		@FindBy (xpath = "//*[@id=\"career-website-main\"]/career-website-detail/section/div[2]/div[2]/div/p[1]")
		private WebElement numadictitle;

		@FindBy (xpath = "(//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess'])[1]")
		private WebElement iaminterested;
		
		WebDriver driver;
		public Home(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void e() {
			e.getText();
			System.out.println(e.getText());
		}
		
		public void jobs() {
			jobs.click();
		}
		
		public void QA() {
			System.out.println(QA.getText());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			QA.click();
			
		}
		public void numadictitle() {
			numadictitle.getText();
			System.out.println(numadictitle.getText());
		}
		public void iaminterested() {
			System.out.println(iaminterested.getText());
			
			//WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			// wait.until(ExpectedConditions.elementToBeClickable(iaminterested));
			Actions act = new Actions(driver);
			act.moveToElement(iaminterested).click().perform();

			//iaminterested.click();
		//boolean t = iaminterested.isEnabled();
		//System.out.println(t);
		//	JavascriptExecutor jd1 = (JavascriptExecutor) driver;
			//jd1.executeScript("arguments[0].click();", iaminterested);
			//iaminterested.click();
		}
		
		
	}



