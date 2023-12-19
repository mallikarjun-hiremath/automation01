package selectex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/abc.html");
		WebElement cpbox = driver.findElement(By.id("cp"));
		Select s=new Select(cpbox);
		List<WebElement> alloptions = s.getOptions();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<alloptions.size();i++) {
			 String text = alloptions.get(i).getText();
			 al.add(text);
			 
		}
		Collections.sort(al);
		for(String e:al) {
			System.out.println(e);
		}
	
		
	}

}
