package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Applicationform {
	
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003217\"]/div/lyte-dropdown/div[1]/lyte-drop-button")
		private WebElement None;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003149\"]/div/lyte-input/div/input")
		private WebElement firstname;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003151\"]/div/lyte-input/div/input")
		private WebElement lastname;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003155\"]/div/lyte-input/div/input")
		private WebElement Email;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003161\"]/div/div/lyte-input/div/input")
		private WebElement mobile;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003169\"]/div/lyte-input/div/input")
		private WebElement Street;
		
		@FindBy (xpath = "(//*[@id=\"inputId\"])[1]")
		private WebElement city;
		
		@FindBy (xpath = "(//*[@id=\"inputId\"])[2]")
		private WebElement state;
		
		@FindBy (xpath = "(//*[@id=\"inputId\"])[3]")
		private WebElement zipcode;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003177\"]/div/lyte-input/div/input")
		private WebElement country;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003181\"]/div/lyte-input/div/input")
		private WebElement currenemploy;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000003183\"]/div/lyte-dropdown/div[1]/lyte-drop-button/span")
		private WebElement none2;
		
		@FindBy (xpath = "//*[@id=\"addSkills\"]")
		private WebElement skillset;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000285107\"]/div/lyte-input/div/input")
		private WebElement currentctc;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000285115\"]/div/lyte-input/div/input")
		private WebElement expectedctc;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000279001\"]/div/lyte-input/div/input")
		private WebElement noticeperiod;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000279009\"]/div/lyte-input/div/input")
		private WebElement reasonforchange;
		
		@FindBy (xpath = "//*[@id=\"rec-form_53264000000279013\"]/div/lyte-input/div/input")
		private WebElement whynumadic;
		
		@FindBy (xpath = "(//div[@class='lyteField  '])[5]")
		private WebElement linkdin;
		
		@FindBy (xpath = "//a[text()='Upload your resume']")
		private WebElement browser;
		
		@FindBy (xpath = "//*[@id=\"cw-submit-btn\"]/button/lyte-yield")
		private WebElement submit;
		
		
		WebDriver driver;
		public Applicationform(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void None() {
			Select select = new Select(None);
			select.selectByVisibleText("Ms.");
		
		}

		public void firstname() {
			firstname.sendKeys("Vijaya");
		
		}

		
		public void lastname() {
			lastname.sendKeys("Birajdar");
		
		}

		
		public void Email() {
			Email.sendKeys("birajdarvijaya@gmail.com");
		
		}

		
		public void mobile() {
			mobile.sendKeys("9423296316");
		
		}

		public void Street() {
			Street.sendKeys("Chinchwad");
		
		}

		
		public void city() {
			city.sendKeys("pune");
			Actions act = new  Actions (driver);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			act.moveToElement(city).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		}

		public void state() {
			state.sendKeys("Maharastra");
		
		}

		
		public void zipcode() {
			zipcode.sendKeys("411019");
		
		}

		
		public void country() {
			country.sendKeys("India");
		}

		
		public void curretnemploy() {
			currenemploy.sendKeys("Vijaya Birajdar");
		
		}

		
		public void none2() {
			Select select = new Select(none2);
			select.selectByVisibleText("Project-Lead");
		
		}
		public void skillset() {
			skillset.sendKeys("Manual testing, Automation testing");
		}
		
		public void expectedctc() {
			expectedctc.sendKeys("8.5LPA");
		}
		
		public void noticeperiod() {
			noticeperiod.sendKeys(" ");
		}

		
		public void reasonforchange() {
			reasonforchange.sendKeys("Career Growth");
		}

		
		public void whynumadic() {
			whynumadic.sendKeys("because I believe this organisation is interesting, forward-thinking, and fast-moving");
		}

		
		public void linkdin() {
			linkdin.sendKeys("www.linkedin.com/in/vijaya-birajdar-1a9a79252");
		}

		
		public void currentctc() {
			currentctc.sendKeys("4.8LPA");
		}
		
		public void submit() {
			submit.click();
		}

		public WebElement browsefile() {
	      return browser;
		}

	}



