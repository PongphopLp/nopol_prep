/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 17:45:04 GMT 2022
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
      byteArray0[0] = (byte)121;
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(121, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-6);
      int int0 = target0.__target__(byteArray0, 0);
      assertEquals((-100663296), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, 3057);
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
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2 out of bounds for length 2
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[18];
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(0, int0);
  }
}