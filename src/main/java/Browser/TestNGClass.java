package Browser;

import org.testng.Assert;  
import org.testng.annotations.Listeners;  
import org.testng.annotations.Test; 
 
@Listeners(Browser.TestNGListener.class)
public class TestNGClass extends TestNGListener{
 
  @Test  
  public void addition() {  
    int sum = 0;  
    int num1 = 3;  
    int num2 = 3;  
    sum = num1 + num2;  
    System.out.println(sum);  
  }
  
  @Test  
    public void fail() {  
    System.out.println("Test case has been failed");  
    Assert.assertTrue(false);  
  } 
}
