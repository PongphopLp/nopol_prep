/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 12:35:02 GMT 2022
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
      int[] intArray0 = new int[9];
      int[] intArray1 = new int[9];
      intArray1[0] = (-1);
      int int0 = target0.__target__(intArray1, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[3];
      int int0 = target0.__target__(intArray1, intArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, intArray0);
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
      int[] intArray0 = new int[9];
      intArray0[1] = (-1);
      int[] intArray1 = new int[9];
      int int0 = target0.__target__(intArray1, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[9];
      int int0 = target0.__target__(intArray0, intArray1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      int int0 = target0.__target__(intArray0, intArray0);
      assertEquals(0, int0);
  }
}
