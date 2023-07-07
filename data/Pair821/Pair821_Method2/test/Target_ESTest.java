/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 20:04:27 GMT 2022
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
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1258.042096;
      double[] doubleArray1 = target0.__target__(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {2516.084192}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      double[] doubleArray2 = target0.__target__(doubleArray1, doubleArray0);
      assertNull(doubleArray2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = target0.__target__(doubleArray0, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, doubleArray0);
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
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[0];
      double[] doubleArray2 = target0.__target__(doubleArray0, doubleArray1);
      assertNull(doubleArray2);
  }
}