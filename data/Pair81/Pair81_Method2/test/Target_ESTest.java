/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 13:52:07 GMT 2022
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
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)127;
      byte[] byteArray1 = new byte[2];
      boolean boolean0 = target0.__target__(byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = target0.__target__(byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Target target0 = new Target();
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-25);
      boolean boolean0 = target0.__target__(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[1];
      boolean boolean0 = target0.__target__(byteArray1, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = target0.__target__(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = target0.__target__(byteArray0, (byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = target0.__target__((byte[]) null, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = target0.__target__(byteArray0, byteArray0);
      assertTrue(boolean0);
  }
}
