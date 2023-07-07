/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 21:06:35 GMT 2022
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
      byteArray0[1] = (byte) (-1);
      int int0 = target0.__target__(byteArray0, (byte)0, (byte)1, byteArray0, 1, 255);
      assertEquals((-255), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      int int0 = target0.__target__(byteArray0, 1, 1, byteArray0, (byte)0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, (-1030), 10, (byte[]) null, 3553, 3553);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, 0, (byte)117, byteArray0, (byte)0, 1760);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 9 out of bounds for length 9
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-91);
      int int0 = target0.__target__(byteArray0, (byte)0, (byte)1, byteArray0, 1, 255);
      assertEquals(165, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      int int0 = target0.__target__(byteArray0, (byte)0, (byte)1, byteArray0, 1, 255);
      assertEquals((-254), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      int int0 = target0.__target__(byteArray0, (byte) (-1), (byte)1, byteArray0, 1, (byte) (-1));
      assertEquals(2, int0);
  }
}
