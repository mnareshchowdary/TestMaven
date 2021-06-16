package FirstTest;
import org.testng.annotations.Test;


public class FirstTestngClass {
	FirstMain.FirstProgram objFirstProgram;
	
  @Test
  public void FirstTest() {
	 String s = objFirstProgram.oddeven();
	  System.out.println("Number enter is :"+s);
	  
  }
}
