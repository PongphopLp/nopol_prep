/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 20:53:52 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1689.859120030355);
      double[] doubleArray1 = new double[6];
      boolean boolean0 = target0.__target__(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      boolean boolean0 = target0.__target__(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1689.859120030355);
      double[] doubleArray1 = new double[6];
      boolean boolean0 = target0.__target__(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      boolean boolean0 = target0.__target__(doubleArray1, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      boolean boolean0 = target0.__target__(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[0];
      boolean boolean0 = target0.__target__((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[6];
      boolean boolean0 = target0.__target__(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      boolean boolean0 = target0.__target__(doubleArray0, doubleArray1);
      assertTrue(boolean0);
  }
}
