/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 16:56:33 GMT 2022
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
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = (-1);
      boolean boolean0 = target0.__target__(intArray0, intArray0, 2);
      assertFalse(boolean0);
      assertArrayEquals(new int[] {(-1), 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      intArray0[1] = (-1);
      boolean boolean0 = target0.__target__(intArray0, intArray0, 2);
      assertFalse(boolean0);
      assertArrayEquals(new int[] {0, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[2];
      intArray1[0] = 1;
      boolean boolean0 = target0.__target__(intArray0, intArray1, 1);
      assertFalse(boolean0);
      assertArrayEquals(new int[] {(-1)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, (int[]) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, intArray0, 4382);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4381 out of bounds for length 8
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      boolean boolean0 = target0.__target__(intArray0, intArray0, 1);
      assertArrayEquals(new int[] {0}, intArray0);
      assertFalse(boolean0);
  }
}
