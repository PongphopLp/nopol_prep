/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 10:28:32 GMT 2022
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
      int[][] intArray0 = new int[12][2];
      int[] intArray1 = new int[11];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        target0.__target__(0, 0, 3570, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2 out of bounds for length 2
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[][] intArray0 = new int[12][2];
      int[] intArray1 = new int[11];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        target0.__target__(0, 1, (-1151), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2 out of bounds for length 2
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__(3, 3, 3, (int[][]) null);
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
      int[][] intArray0 = new int[12][2];
      int[] intArray1 = new int[7];
      intArray1[1] = 9;
      intArray0[0] = intArray1;
      boolean boolean0 = target0.__target__(0, 0, 9, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[][] intArray0 = new int[9][3];
      boolean boolean0 = target0.__target__(0, 0, 0, intArray0);
      assertFalse(boolean0);
  }
}