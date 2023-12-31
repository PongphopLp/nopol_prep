/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:59:49 GMT 2022
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
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)108;
      boolean boolean0 = target0.__target__(byteArray0, 0, byteArray1, 0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray0, 0, byteArray0, (byte)0, 4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray0, (byte)0, byteArray0, (-1), (byte) (-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = target0.__target__(byteArray0, 0, byteArray0, 0, (byte)1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = target0.__target__(byteArray0, 1, byteArray0, 3, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, (-2072), (byte[]) null, (-2072), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[17];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, 1, byteArray0, (-1), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 17
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray0, 0, byteArray1, 0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray0, (-1), byteArray0, (byte) (-93), 1573);
      assertFalse(boolean0);
  }
}
