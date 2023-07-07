/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 17:51:14 GMT 2022
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
      byteArray0[3] = (byte)8;
      int int0 = target0.__target__(byteArray0, 0);
      assertEquals(134217728, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)8;
      int int0 = target0.__target__(byteArray0, (byte)1);
      assertEquals(524288, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)1;
      int int0 = target0.__target__(byteArray0, 0);
      assertEquals(256, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)59;
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-66);
      int int0 = target0.__target__(byteArray0, 0);
      assertEquals((-1107296256), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-1);
      int int0 = target0.__target__(byteArray0, 1);
      assertEquals(16711680, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-23);
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 3 out of bounds for length 3
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-78);
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(178, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      int int0 = target0.__target__(byteArray0, (byte)0);
      assertEquals(0, int0);
  }
}