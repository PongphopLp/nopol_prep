/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 16:55:28 GMT 2022
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
      int[] intArray0 = new int[6];
      intArray0[0] = (-729);
      int[] intArray1 = new int[5];
      boolean boolean0 = target0.__target__(intArray1, intArray0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[6];
      boolean boolean0 = target0.__target__(intArray0, intArray0, (-3156));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, (int[]) null, 807);
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
      int[] intArray0 = new int[6];
      intArray0[0] = (-729);
      int[] intArray1 = new int[5];
      boolean boolean0 = target0.__target__(intArray0, intArray1, 2339);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      boolean boolean0 = target0.__target__(intArray0, intArray0, 9);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, intArray0, 3453);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }
}
