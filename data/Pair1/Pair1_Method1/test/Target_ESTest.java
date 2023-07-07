/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 10:39:31 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "uD]gwk;.M.N";
      stringArray0[2] = "Target";
      stringArray0[3] = "";
      String string0 = target0.__target__(stringArray0, (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, stringArray0[0], stringArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "(!";
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, "(!", "(!");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      String string0 = target0.__target__(stringArray0, "", "KTe!xvr'S-utl`]!ES");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1";
      String string0 = target0.__target__(stringArray0, "<_lt)f", "1");
      assertEquals("1", string0);
  }
}