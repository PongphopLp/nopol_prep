/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 17:52:19 GMT 2022
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
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-95);
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(161, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)2;
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(512, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)121;
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(7929856, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      int int0 = target0.__target__(byteArray0, 255);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)60;
      int int0 = target0.__target__(byteArray0, 0);
      assertEquals(1006632960, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-100);
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals((-1677721600), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (-3024));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -3024 out of bounds for length 4
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__((byte[]) null, 0);
      assertEquals(0, int0);
  }
}
