/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 13:31:27 GMT 2022
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
      doubleArray0[0] = 2178.0;
      double double0 = target0.__target__(doubleArray0);
      assertEquals(677669.1428571428, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1378524.2494451504;
      doubleArray0[1] = 1378524.2494451504;
      doubleArray0[2] = 1378524.2494451504;
      doubleArray0[3] = 1378524.2494451504;
      doubleArray0[4] = 1378524.2494451504;
      doubleArray0[5] = 1378524.2494451504;
      doubleArray0[6] = 1378524.2494451504;
      doubleArray0[7] = 1378524.2494451504;
      double double0 = target0.__target__(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Target target0 = new Target();
      double double0 = target0.__target__(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double double0 = target0.__target__(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }
}
