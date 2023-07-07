/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 00:59:06 GMT 2022
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
      int[] intArray0 = new int[7];
      intArray0[0] = (-2948);
      int[] intArray1 = new int[7];
      boolean boolean0 = target0.__target__(intArray1, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[1];
      boolean boolean0 = target0.__target__(intArray1, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, (int[]) null);
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
      int[] intArray0 = new int[7];
      intArray0[0] = (-2948);
      int[] intArray1 = new int[7];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[6];
      int[] intArray1 = new int[7];
      boolean boolean0 = target0.__target__(intArray1, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[6];
      boolean boolean0 = target0.__target__(intArray0, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((int[]) null, (int[]) null);
      assertTrue(boolean0);
  }
}
