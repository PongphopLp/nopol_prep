/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 07:21:51 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<String> list0 = List.of("H@2Uxt55oFROZ~z&%az", "H@2Uxt55oFROZ~z&%az", "H@2Uxt55oFROZ~z&%az", "H@2Uxt55oFROZ~z&%az", "H@2Uxt55oFROZ~z&%az");
      Target target0 = new Target();
      List<String> list1 = target0.__target__(list0);
      assertTrue(list1.contains("H@2Uxt55oFROZ~z&%az"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "4[N0lj*w";
      stringArray0[1] = "";
      stringArray0[2] = "Target";
      stringArray0[3] = "";
      stringArray0[4] = "";
      List<String> list0 = List.of(stringArray0);
      // Undeclared exception!
      try { 
        target0.__target__(list0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("IqA*4");
      List<String> list0 = target0.__target__(linkedList0);
      assertTrue(list0.contains("IqA*4"));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      List<String> list0 = List.of("1!e0\"@m\">9u7v");
      List<String> list1 = target0.__target__(list0);
      assertFalse(list1.contains("1!e0\"@m\">9u7v"));
  }
}
