package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgaizationTest {
     
	@Test
	public void CreateOrganizationsTest() {
		
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://localhost:8888/");
	}
}
