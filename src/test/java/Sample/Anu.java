package Sample;

import org.testng.annotations.Test;

public class Anu 
{
	@Test(groups = "smoke")
	public void m3()
	{
		System.out.println("Hii gud mrng");
		String b = System.getProperty("browser");
		System.out.println(b);
		String u  =System.getProperty("url");
		System.out.println(u);
	}
}
