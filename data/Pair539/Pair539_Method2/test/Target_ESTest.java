/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 12:09:15 GMT 2022
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
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[6];
      boolean boolean0 = target0.__target__(booleanArray1, booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = true;
      boolean boolean0 = target0.__target__(booleanArray1, booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[3];
      boolean[] booleanArray1 = new boolean[3];
      boolean boolean0 = target0.__target__(booleanArray1, booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[3];
      boolean[] booleanArray1 = new boolean[5];
      boolean boolean0 = target0.__target__(booleanArray0, booleanArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[0];
      boolean boolean0 = target0.__target__(booleanArray0, (boolean[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[0];
      boolean boolean0 = target0.__target__((boolean[]) null, booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[3];
      boolean boolean0 = target0.__target__(booleanArray0, booleanArray0);
      assertTrue(boolean0);
  }
}
