package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	@Parameters("s1")
	@Test
	public void TestSample(int i)
	{
		System.out.println(i);
	}
}
