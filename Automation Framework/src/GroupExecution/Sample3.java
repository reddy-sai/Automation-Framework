package GroupExecution;

import org.testng.annotations.Test;

public class Sample3 {


	@Test(groups="Functional")
	public void TestFunctionalScenario()
	{
	System.out.println("Functional Testing is done");
	}

	@Test(groups="Integration")
	public void TestIntegrationScenario()
	{
		System.out.println("Integration Testing is done");
	}
	
	@Test(groups="System")
	public void TestSystemScenario()
	{
		System.out.println("System Testing is done");
	}

}
