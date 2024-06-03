package testng;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class basemethod {
	public static WebDriver driver;
    public static void  setup() {
		 driver= new ChromeDriver();
		  }
    public static void seturl() {
		driver.get("https://www.irctc.co.in/nget/train-search"); 
	driver.manage().window().maximize();
	//driver.switchTo().alert().accept();
	 }
    public static  void busselect() {
		 driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[4]/a/label")).click();
	 }
    public static void windowshandle() {
   	 Set<String> parentab = driver.getWindowHandles();
   	 Object[] xyza = parentab.toArray();
   	 String aa = xyza[0].toString();
   	 String ab = xyza[1].toString();
   	 System.out.println(aa);
   	 System.out.println(ab);
   	 driver.switchTo().window(ab);
   	 }
   	 public static void boardng() throws InterruptedException {
    	 //id="departFrom"
    	 driver.findElement(By.id("departFrom")).sendKeys("Chennai");
    	 Thread.sleep(2000);
    	 //class="ui-menu-item-wrapper"... 
    	 List<WebElement> location = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
    	 for(int i =0;i<location.size();i++ ) {
    		 System.out.println(location.get(i).getText());
    		 if(location.get(i).getText().equalsIgnoreCase("Chennai") ) {
    			 location.get(i).click();
    		 }
    	 }
    	      driver.findElement(By.id("goingTo")).sendKeys("Bangalore");
    	      Thread.sleep(2000);
    	      List<WebElement> destination= driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
    	      for(int i =0; i<destination.size();i++) {
    	    	  System.out.println(destination.get(i).getText());
    	    	  if(destination.get(i).getText().equalsIgnoreCase("Bangalore")) {
    	    		  destination.get(i).click();
    	    	  }
    	      }
         	 WebElement date = driver.findElement(By.partialLinkText("15"));
    	     date.click();
    	     System.out.println( date );
    	     driver.findElement(By.xpath("/html/body/app-root/ng-component/div[3]/div[2]/div[2]/form/div[4]/button")).click();
    	            Thread.sleep(2000);}
   	 public static void seatselect() throws InterruptedException {
   	   
	          WebElement selectseat= driver.findElement(By.xpath("//*[@id=\"accordionExample\"]/div[1]/div[7]/button"));
			 Actions a = new Actions(driver);
			 a.click(selectseat).build().perform();
			 Thread.sleep(3000);
			 WebElement chooseseat = driver.findElement(By.xpath("//*[@id=\"seatLayout0\"]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/span[7]"));
			 Actions b = new Actions(driver);
	         b.click(chooseseat).build().perform();
	         Thread.sleep(2000);
	         }
   	public static void pickupanddrop() throws InterruptedException {
   	   
   	    	         WebElement boarding = driver.findElement(By.xpath(" //*[@id=\"myTabContent\"]/div/div/table/tbody/tr[9]/td[1]/input"));
   	    	         Actions c = new Actions(driver);
   	    	         c.click(boarding).build().perform();
   	    	         Thread.sleep(2000);
   	  
   	    	         WebElement dropping = driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/div/div/table/tbody/tr[7]/td[1]/input"));
   	    	         Actions d = new Actions(driver);
   	    	         d.click(dropping).build().perform();
   	    	         Thread.sleep(10000);
   	    			 }

    public static void pay() throws InterruptedException {
        
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"seatLayout0\"]/div/div/div[2]/div[2]/div[4]/button"));
        pay.click();
        driver.findElement(By.id("profile-tab")).click();
        driver.findElement(By.id("emailLogin")).sendKeys("bharanikrishna06@gmail.com");
        driver.findElement(By.id("phoneLogin")).sendKeys("8870409814");
        Thread.sleep(2000);
        WebElement login=  driver.findElement(By.xpath("//*[@id=\"profile\"]/div/form/div[3]/button"));
        Actions e = new Actions(driver);
         e.click(login).build().perform();
         Thread.sleep(10000);

        driver.findElement(By.xpath("//input[contains(@name,'address')]")).sendKeys("valasakkadu");
        Thread.sleep(2000);//name="pincode"
        driver.findElement(By.name("pincode")).sendKeys("608701");
        Thread.sleep(2000);
        }
    public static  void tear() throws InterruptedException {
   	 
   	 driver.findElement(By.id("dropdown11")).click();
   	 driver.findElement(By.xpath("//a[text()='Logout']")).click();
   	 Thread.sleep(1000);
    }
   	 
   	 
}

