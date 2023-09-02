package com.baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseClass {
	public WebDriver driver;
	public void Browser_Launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\ELCOT\\\\\\\\eclipse-workspace\\\\\\\\Test\\\\\\\\dri\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		}
	private void SetURl() {                                         //seturl
driver.get("https://adactinhotelapp.com/");
	}
  public void clcik(WebElement element) {                      // click
element.click();
}
  public void Maximum() {                                      // maximum
driver.manage().window().maximize();
}
  public void SelectbyIndex(WebElement element,int Index) {       //selectby index
	  Select k=new Select(element);
	  k.selectByIndex(Index);
}
public void OPenUrl(String url) {                            // get url
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
}

//public void DragAndDrop(WebElement from,WebElement to) {
//Actions A=new Actions(driver);                                     // DragAndDrop
//A.dragAndDrop(from, to);

public void Navigate() {
driver.navigate().back();                           // navigate
}
public void GetWIndowHandle(WebElement move ) {
Actions j=new Actions(driver);                                          // getwindowhandle
j.moveToElement(move).build().perform();
}

public void switc() {                                                   //switch
	driver.switchTo().defaultContent();
}
public void MoveToElement(WebElement j) {	               // movetoelement
Actions jk=new Actions(driver);
jk.moveToElement(j).build().perform();
}
public void frame(WebElement j) {
driver.switchTo().frame(0);                               //frame
}
public void qiut() {                                                  //quit
driver.quit();
}
public void manage() {                                                        //manage
driver.manage().window().fullscreen();
}
public void Scriptt() {
	JavascriptExecutor js=(JavascriptExecutor) driver;                                //Script
	js.executeScript("window.scroll(0.900)", "");}
public void Sendkeys(WebDriver h) {

}
public void gettitle() {                                                                         //gettitle
driver.getTitle();}
public void Selectall(WebElement aj) {
Select af=new Select(aj);
af.selectByValue("Cucumber JVM: Core");   }                                           //selctbyvalue}
public void selectbyvisibletext(WebElement ak) {
Select ap=new Select(ak);                                                            //selectbyvisibletext
ap.selectByVisibleText("JVM");}
public void deselectbyall(WebElement af) {
Select h=new Select(af);                                                                   //deselectall
h.deselectAll();}
public void deselctbyindex(WebElement index) {                                      
Select hd=new Select(index);                                                                 //deselctbyindex
hd.deselectByIndex(0);}
public void Deselectbytext(WebElement text) {
Select a=new Select(text);                                                                //deselctbyvisibletext
a.deselectByVisibleText("Cucumber JVM: Core");}
public void refresh() {
	driver.navigate().refresh();    }                                      //refresh
public void frorward() {
driver.navigate().forward();         }                                      //forward
public void currenturl() {
driver.getCurrentUrl();           }                              //geturl
public void getpagesource() {
driver.getPageSource();}                                       //getpagesoure
public void getattribute() {
driver.getTitle();}   //get title

public void Sendkeys(WebElement jp,String fkr) {
jp.sendKeys("paddu");               }                             //sendkeys
public void simpleAlert( Alert k) {
	driver.switchTo().alert();                          //simplealert
	k.accept();                                }

public void confirmalert(WebElement al, Alert kl  ) {
al.click();                                                    //confirm alert
driver.switchTo().alert();
kl.dismiss();}


public void PromtAlert(WebElement ap, Alert con) {
ap.click();                                                 //prompt Alert
driver.switchTo().alert();
con.sendKeys("confirm");
con.accept();}


public void Actions(WebElement act) {
Actions n=new Actions(driver);                                      //Actionsclick
act.click();}

public void doubleclick(WebElement ao) {
Actions a=new Actions(driver);                                 //Actions Doubleclick
a.doubleClick();}


public void ContextClick(WebElement au) {
Actions q=new Actions(driver);                                //Actions Context Click
q.contextClick();}

public void Movetoelement(WebElement qk) {
Actions w=new Actions(driver);
w.moveToElement(qk);                  }                           //moveto element

public void draganddrop(WebElement ak) {
Actions e=new Actions(driver);                                   //draoganddrop
e.dragAndDrop(ak, ak).build().perform();}


public void dropdown(WebElement nk) {
	Select drop=new Select(nk);
	drop.getFirstSelectedOption();                            //dragandrop
	System.out.println(drop);}
public void IMplicitwait(int sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);    }  //implicit method
	
public void screenshot(String path) throws IOException {
	TakesScreenshot jk=(TakesScreenshot) driver;             
	File source = jk.getScreenshotAs(OutputType.FILE);         // screenshot
	File destination =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Test\\screenshot\\selenium.png");   
   FileUtils.copyFile(source, destination);}


public void thread(WebElement hero) throws InterruptedException {
	Select s=new Select(hero);                                       //thread
Thread.sleep(3000);}

public void robot() throws AWTException {
	Robot j=new Robot();
    j.keyPress(KeyEvent.VK_RIGHT);
    j.keyRelease(KeyEvent.VK_RIGHT);
    j.keyPress(KeyEvent.VK_ENTER);                //robot
    j.keyRelease(KeyEvent.VK_ENTER);}


public void iseneble(WebElement cn) {
	cn.isEnabled();}                               //iseneble

public void isdisplay(WebElement cm) {             //isdisplayed
boolean displayed = cm.isDisplayed();
System.out.println(displayed);}

public void is_Selected(WebElement x) {          //isselected
x.isSelected();
}
public void navigate(String url) {
driver.navigate().to(url); }                    //navigate url



public void explicitwait( Duration sec,  WebElement ip) {
	WebDriverWait k=new WebDriverWait(driver,sec) ;                                   // explicit wait
	WebElement  web= k.until(ExpectedConditions.elementToBeClickable((ip)));
	
	
}
}
