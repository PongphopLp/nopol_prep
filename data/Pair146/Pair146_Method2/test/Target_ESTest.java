/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 14:02:36 GMT 2022
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
      byteArray0[0] = (byte)103;
      byte[] byteArray1 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = target0.__target__(byteArray0, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, (byte[]) null);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)103;
      byte[] byteArray1 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = target0.__target__(byteArray1, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = target0.__target__(byteArray0, byteArray0);
      assertTrue(boolean0);
  }
}
