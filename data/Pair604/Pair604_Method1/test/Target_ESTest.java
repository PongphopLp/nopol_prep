/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 15:38:15 GMT 2022
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[8] = (byte)21;
      long long0 = target0.__target__(byteArray0);
      assertEquals(21L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      long long0 = target0.__target__(byteArray0);
      assertEquals(256L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-128);
      long long0 = target0.__target__(byteArray0);
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null);
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
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      long long0 = target0.__target__(byteArray0);
      assertEquals(0L, long0);
  }
}
