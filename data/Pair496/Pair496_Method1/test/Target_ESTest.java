/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 01:28:37 GMT 2022
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
      byteArray0[0] = (byte)19;
      boolean boolean0 = target0.__target__(byteArray0, (byte)1, byteArray0, 0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, 0, (byte[]) null, 0, 1885);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (-105), byteArray0, 1, (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -105 out of bounds for length 3
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)1;
      boolean boolean0 = target0.__target__(byteArray1, 0, byteArray0, (byte)1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = target0.__target__(byteArray0, (byte)1, byteArray0, (byte)1, 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = target0.__target__(byteArray0, (-1), byteArray0, 1541, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = target0.__target__(byteArray0, (-1), byteArray0, (byte)1, (byte) (-99));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = target0.__target__(byteArray0, 80, byteArray0, (byte)51, 1933);
      assertFalse(boolean0);
  }
}
