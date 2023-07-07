/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 15:40:12 GMT 2022
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
      char[] charArray0 = new char[8];
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      boolean boolean0 = target0.__target__(intArray0, 0, 1, charArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[18];
      char[] charArray0 = new char[1];
      boolean boolean0 = target0.__target__(intArray0, 0, 1, charArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 1379, (-1210), (char[]) null, (-1210));
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
      int[] intArray0 = new int[0];
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, (-2807), (-430), charArray0, (-2807));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2807 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      intArray0[0] = (-3381);
      char[] charArray0 = new char[8];
      boolean boolean0 = target0.__target__(intArray0, 0, 1, charArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      char[] charArray0 = new char[6];
      boolean boolean0 = target0.__target__(intArray0, 3474, 3474, charArray0, 10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      char[] charArray0 = new char[6];
      boolean boolean0 = target0.__target__(intArray0, 654, (-364), charArray0, 701);
      assertTrue(boolean0);
  }
}