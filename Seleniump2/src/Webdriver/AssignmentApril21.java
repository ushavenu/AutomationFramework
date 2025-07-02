package Webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.sessionqueue.NewSessionQueue;

import io.netty.handler.ssl.JdkApplicationProtocolNegotiator.SslEngineWrapperFactory;


public class AssignmentApril21 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/** 1.Navigate to Ajio.com Without using get() */
		//driver.navigate().to("https://www.ajio.com/");
		driver.navigate().to(new URL("https://www.ajio.com/"));
		Thread.sleep(1000);
		/** 2. Then Perform back and Forward operation */
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		/**3. Then Capture the Title and verify */
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			
			System.out.println("Welcome Page is Displayed");
		}
		else
		{
			System.out.println("Welcome Page is not Displayed");
		}
		/**4. Then Reposition the window to X=350 n Y=270 */
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(350,270)); 
		
		/** 5.Then Resize the window to width=400 n height = 300*/
	      driver.manage().window().setSize(new Dimension(400,300));
		
	}

}
