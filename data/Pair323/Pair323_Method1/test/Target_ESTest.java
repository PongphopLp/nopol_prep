/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 11:25:59 GMT 2022
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
      String[] stringArray1 = new String[3];
      boolean boolean0 = target0.__target__(stringArray1, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "`c";
      String[] stringArray1 = new String[4];
      boolean boolean0 = target0.__target__(stringArray0, stringArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "`c";
      stringArray0[1] = "";
      stringArray0[2] = "R?q<sQF pKmt9?";
      stringArray0[3] = "b>@";
      boolean boolean0 = target0.__target__(stringArray0, stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      String[] stringArray1 = new String[3];
      boolean boolean0 = target0.__target__(stringArray0, stringArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[2];
      boolean boolean0 = target0.__target__(stringArray0, (String[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((String[]) null, (String[]) null);
      assertTrue(boolean0);
  }
}
