/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 14:33:14 GMT 2022
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
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = target0.__target__(doubleArray0, (-1606));
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0;
      double[] doubleArray1 = target0.__target__(doubleArray0, 0);
      assertArrayEquals(new double[] {1.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      target0.__target__(doubleArray0, 3633);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = target0.__target__(doubleArray0, (-490));
      assertNotSame(doubleArray0, doubleArray1);
  }
}
