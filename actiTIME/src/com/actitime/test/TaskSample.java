package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskSample {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	driver.findElement(By.xpath("//div[.='Add New']")).click();
	driver.findElement(By.xpath("//div[.='+ New Tasks']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[.='- Select Customer -'and @class='selectedItem']"))));
	driver.findElement(By.xpath("//div[.='- Select Customer -'and @class='selectedItem']")).click();
	driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name'and @class]")).sendKeys("Ramu");
	driver.findElement(By.xpath("//input[@placeholder='Enter Project Name'and @class]")).sendKeys("actitime");
	driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("debugging");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//button[.='set deadline'])[1]")).click();
	Thread.sleep(3000);
	/*WebDriverWait wait1=new WebDriverWait(driver, 10);
	wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='ext-gen124']"))));
*/
	//driver.findElement(By.xpath("(//span[.='30'])[4]")).click();
	
	Thread.sleep(3000);
	/*//driver.findElement(By.xpath("//a[.='May']")).click();
	driver.findElement(By.xpath("//a[.='2020']")).click();
	driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
	driver.findElement(By.xpath("(//span[.='3'])[1]")).click();*/
	driver.findElement(By.xpath("(//span[@class='checkmark checkMark'])[2]")).click();
	driver.findElement(By.xpath("//div[.='Create Tasks']")).click();
}

}
