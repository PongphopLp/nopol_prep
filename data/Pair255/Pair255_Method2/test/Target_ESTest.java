/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 05:24:54 GMT 2022
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
      double[] doubleArray0 = new double[4];
      int[] intArray0 = new int[9];
      intArray0[5] = (-250);
      int int0 = target0.__target__(doubleArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      double[] doubleArray0 = new double[3];
      int int0 = target0.__target__(doubleArray0, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      intArray0[0] = (-2080);
      intArray0[1] = (-2080);
      int int0 = target0.__target__((double[]) null, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      intArray0[0] = (-2080);
      int int0 = target0.__target__((double[]) null, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[6];
      intArray0[2] = 576565924;
      intArray0[3] = 576565924;
      intArray0[4] = (-725);
      // Undeclared exception!
      target0.__target__(doubleArray0, intArray0);
  }
}
