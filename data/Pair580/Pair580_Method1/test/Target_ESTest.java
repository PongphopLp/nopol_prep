/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 13:56:07 GMT 2022
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
      long[] longArray0 = new long[4];
      longArray0[1] = 3619L;
      long[] longArray1 = new long[4];
      boolean boolean0 = target0.__target__(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[3];
      long[] longArray1 = new long[9];
      boolean boolean0 = target0.__target__(longArray0, longArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[3];
      boolean boolean0 = target0.__target__(longArray0, (long[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[2];
      longArray0[1] = 7155L;
      long[] longArray1 = new long[2];
      boolean boolean0 = target0.__target__(longArray1, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[1];
      boolean boolean0 = target0.__target__(longArray0, longArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[3];
      long[] longArray1 = new long[9];
      boolean boolean0 = target0.__target__(longArray1, longArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[3];
      boolean boolean0 = target0.__target__(longArray0, longArray0);
      assertTrue(boolean0);
  }
}
