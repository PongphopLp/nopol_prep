/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 02:25:17 GMT 2022
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
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[24];
      byteArray0[0] = (byte)28;
      boolean boolean0 = target0.__target__(byteArray0, 0, 1, byteArray0, (byte)1, (byte)1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[24];
      boolean boolean0 = target0.__target__(byteArray0, 1, (byte)1, byteArray0, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = target0.__target__(byteArray0, (-1097), (-1097), byteArray0, (-1097), (-1097));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(byteArray0, (byte)0, (byte)0, byteArray0, 1, (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[0];
      boolean boolean0 = target0.__target__(byteArray1, 0, 0, byteArray0, 2012, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = target0.__target__(byteArray0, (-126), 1, byteArray0, 0, 1542);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, (-197), (-197), (byte[]) null, (-786), (-197));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, 0, 1, byteArray0, (-1226), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1226 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[24];
      byteArray0[1] = (byte)26;
      boolean boolean0 = target0.__target__(byteArray0, 0, 1, byteArray0, (byte)1, (byte)1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = target0.__target__(byteArray0, 243, 243, byteArray0, 1, 243);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[24];
      boolean boolean0 = target0.__target__(byteArray0, (-416), (byte)26, byteArray0, (byte)1, (-3064));
      assertFalse(boolean0);
  }
}