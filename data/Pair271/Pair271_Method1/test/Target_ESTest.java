/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 07:37:21 GMT 2022
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 922.792379;
      double double0 = target0.__target__(doubleArray0, doubleArray0);
      assertEquals(851545.7747404797, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 922.792379;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-1666.746553582);
      double double0 = target0.__target__(doubleArray0, doubleArray1);
      assertEquals((-1538061.0173699846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[8];
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
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        target0.__target__(doubleArray0, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double double0 = target0.__target__(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
