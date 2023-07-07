/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 19:19:02 GMT 2022
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
      doubleArray0[0] = (-4400.767791195706);
      double double0 = target0.__target__(doubleArray0, doubleArray0, (-833.86525298), 2225.4963698221);
      assertEquals(1.2500653894255515E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[7];
      double double0 = target0.__target__(doubleArray0, doubleArray0, (-2815.232650121607), 3.9583084699612215E7);
      assertEquals((-7.800491470721414E11), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, (double[]) null, 0.0, 0.0);
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
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        target0.__target__(doubleArray0, doubleArray1, 1.0, 1.0);
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
      double[] doubleArray0 = new double[7];
      double double0 = target0.__target__(doubleArray0, doubleArray0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}