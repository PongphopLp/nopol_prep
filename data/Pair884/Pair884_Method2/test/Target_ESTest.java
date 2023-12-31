/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 02:24:51 GMT 2022
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
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)68;
      boolean boolean0 = target0.__target__(byteArray0, (byte)1, (byte)68, byteArray0, 0, (byte)68);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (byte)1, (byte)68, byteArray0, 0, (byte)68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = target0.__target__(byteArray0, (byte) (-1), (-2579), byteArray0, (byte) (-1), (-2579));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = target0.__target__(byteArray0, (-108), (-1), byteArray0, (-1), 21);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      boolean boolean0 = target0.__target__(byteArray0, (byte)0, (byte)1, byteArray0, (byte)1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = target0.__target__(byteArray0, 0, 1, byteArray0, 0, (byte)1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = target0.__target__(byteArray0, (byte)0, (-2021), byteArray0, (byte)0, (-3386));
      assertFalse(boolean0);
  }
}
