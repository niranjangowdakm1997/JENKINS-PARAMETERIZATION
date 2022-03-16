package Project;

import org.testng.annotations.Test;

public class SimpleProjectForPrameterization {
	
	@Test
	
	public void runInGithub()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
			

}
