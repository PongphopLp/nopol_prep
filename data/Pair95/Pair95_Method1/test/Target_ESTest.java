/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 16:58:05 GMT 2022
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
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-94);
      String string0 = target0.__target__(byteArray0);
      assertEquals("AACiAAAAAAA=", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-94);
      String string0 = target0.__target__(byteArray0);
      assertEquals("AAAAAKIAAAA=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)47;
      String string0 = target0.__target__(byteArray0);
      assertEquals("AC8=", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      String string0 = target0.__target__(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-8);
      String string0 = target0.__target__(byteArray0);
      assertEquals("+A==", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      String string0 = target0.__target__(byteArray0);
      assertEquals("/w==", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte[]) null);
      assertNull(string0);
  }
}
