package selectex;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\LENOVO\\Desktop\\abc.html");
		WebElement cpbox=driver.findElement(By.id("cp"));
		
		Select s=new Select(cpbox);
		
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--) {
			s.deselectByIndex(i);
			
		}
		WebElement pvbox=driver.findElement(By.id("pv"));
        Select s1=new Select(pvbox);
		
		List<WebElement> alloption = s1.getOptions();
		int counta = alloption.size();
		for(int i=0;i<counta;i++) {
			s1.selectByIndex(i);
		}
		for(int i=counta-1;i>=0;i--) {
			s1.deselectByIndex(i);
			
		}
	}

}
