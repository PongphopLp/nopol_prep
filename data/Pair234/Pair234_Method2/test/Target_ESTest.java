/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 00:55:50 GMT 2022
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
      int[] intArray0 = new int[7];
      intArray0[6] = 2812;
      int[] intArray1 = new int[7];
      boolean boolean0 = target0.__target__(intArray1, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[0];
      boolean boolean0 = target0.__target__(intArray1, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      intArray0[1] = 1640;
      int[] intArray1 = new int[2];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[2];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      boolean boolean0 = target0.__target__(intArray0, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      boolean boolean0 = target0.__target__((int[]) null, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      boolean boolean0 = target0.__target__(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[0];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertFalse(boolean0);
  }
}
