package utiity;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class utility {
	
		WebDriver driver;
		public void imageUpload(WebElement element,String path) {
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			JavascriptExecutor jd1 = (JavascriptExecutor) driver;
			jd1.executeScript("arguments[0].scrollIntoView();", element);
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			waitForLoad(2);
			
			Robot rb;
			try {
				rb = new Robot();

				rb.delay(3000);

			

				StringSelection se1 = new StringSelection(path);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se1, null);
				// CTRL+V
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);

				rb.delay(3000);

				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);

				rb.delay(2000);
				// ENTER
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void waitForLoad(int i) {
			// TODO Auto-generated method stub
			
		}
		public void enterScript(WebElement ele) {
			JavascriptExecutor jd1 = (JavascriptExecutor) driver;
			jd1.executeScript("arguments[0].scrollIntoView();", ele);
			//ele.sendKeys(value);
		}

	}



