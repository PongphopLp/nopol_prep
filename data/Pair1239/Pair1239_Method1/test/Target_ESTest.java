/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 03:34:52 GMT 2022
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
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte)123;
      boolean boolean0 = target0.__target__("", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[16];
      byteArray0[0] = (byte) (-94);
      boolean boolean0 = target0.__target__("", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[16];
      boolean boolean0 = target0.__target__("", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte)65;
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(",(&(GksUsY;T3[eup", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[41];
      byteArray0[0] = (byte) (-16);
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = target0.__target__("", byteArray0);
      assertFalse(boolean0);
  }
}