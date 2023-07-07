/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 01:16:18 GMT 2022
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
      short[] shortArray0 = new short[8];
      shortArray0[0] = (short)100;
      short[] shortArray1 = new short[8];
      boolean boolean0 = target0.__target__(shortArray0, shortArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[0];
      short[] shortArray1 = new short[7];
      boolean boolean0 = target0.__target__(shortArray0, shortArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[8];
      shortArray0[0] = (short)100;
      short[] shortArray1 = new short[8];
      boolean boolean0 = target0.__target__(shortArray1, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[4];
      short[] shortArray1 = new short[5];
      boolean boolean0 = target0.__target__(shortArray1, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[3];
      boolean boolean0 = target0.__target__(shortArray0, (short[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((short[]) null, (short[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[7];
      boolean boolean0 = target0.__target__((short[]) null, shortArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[7];
      boolean boolean0 = target0.__target__(shortArray0, shortArray0);
      assertTrue(boolean0);
  }
}