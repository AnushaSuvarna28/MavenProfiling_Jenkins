package Sample;

import org.testng.annotations.Test;

public class Data 
{
	@Test
	public void m1()
	{
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String un = System.getProperty("username");
		String pwd = System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}

}
