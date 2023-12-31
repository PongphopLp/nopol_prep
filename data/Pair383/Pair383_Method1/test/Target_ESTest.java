/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 13:56:20 GMT 2022
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
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-3083.010161);
      doubleArray0[1] = (-3083.010161);
      doubleArray0[2] = (-3083.010161);
      doubleArray0[3] = (-3083.010161);
      doubleArray0[4] = (-3083.010161);
      doubleArray0[5] = (-3083.010161);
      doubleArray0[6] = (-3083.010161);
      doubleArray0[7] = (-3083.010161);
      doubleArray0[8] = (-3083.010161);
      double double0 = target0.__target__(doubleArray0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2921.0;
      double double0 = target0.__target__(doubleArray0);
      assertEquals(1.7320508075688774, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null);
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
      doubleArray0[0] = (-3083.010161);
      double double0 = target0.__target__(doubleArray0);
      assertEquals((-3.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[9];
      double double0 = target0.__target__(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
