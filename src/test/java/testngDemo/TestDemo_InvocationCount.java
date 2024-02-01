package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo_InvocationCount
{
  @Test(priority=1)
  public void enrollForTheCourse() 
  {
	  System.out.println("Student enroll for the course");
  }
  
  @Test(priority=2)
  public void training() 
  {
	  System.out.println("Student get the training for the course");
  }
  
  
  @Test(priority=3,invocationCount=3)
  public void palcementCall() 
  {
	  System.out.println("Student get the Placements for the course");
  }
  
}