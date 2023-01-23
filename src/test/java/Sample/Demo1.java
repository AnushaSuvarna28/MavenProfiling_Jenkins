package Sample;

import org.testng.annotations.Test;

public class Demo1 
{
	@Test(groups = {"smoke","regression"})
	public void m2()
	{
		System.out.println("Hi m2");
	}
	@Test(groups = "regression")
	public void m3()
	{
		System.out.println("Hlo");
	}
}
