/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 03:46:06 GMT 2022
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
      int[] intArray0 = new int[9];
      intArray0[3] = 4316;
      int[] intArray1 = new int[9];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[6];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((int[]) null, (int[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      intArray0[1] = (-1);
      int[] intArray1 = new int[9];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[1];
      boolean boolean0 = target0.__target__(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      boolean boolean0 = target0.__target__(intArray0, intArray0);
      assertTrue(boolean0);
  }
}
