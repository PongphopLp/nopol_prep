/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 19:24:22 GMT 2022
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
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-90);
      int int0 = target0.__target__(byteArray0);
      assertEquals(10878976, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-57);
      int int0 = target0.__target__(byteArray0);
      assertEquals(50944, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)15;
      int int0 = target0.__target__(byteArray0);
      assertEquals(983040, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)59;
      int int0 = target0.__target__(byteArray0);
      assertEquals(15104, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)27;
      int int0 = target0.__target__(byteArray0);
      assertEquals(6912, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      int int0 = target0.__target__(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-21);
      int int0 = target0.__target__(byteArray0);
      assertEquals((-352321536), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
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
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      int int0 = target0.__target__(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[1];
      int int0 = target0.__target__(byteArray0);
      assertEquals(0, int0);
  }
}
