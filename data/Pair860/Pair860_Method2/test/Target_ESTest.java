/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 00:24:52 GMT 2022
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
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = target0.__target__(stringBuffer0, "");
      assertEquals("", stringBuffer1.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((StringBuffer) null, (String) null);
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
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        target0.__target__(stringBuffer0, (String) null);
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
      StringBuffer stringBuffer0 = target0.__target__((StringBuffer) null, ".y]EA42v=CyC?')1");
      assertNotNull(stringBuffer0);
      assertEquals(18, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = target0.__target__((StringBuffer) null, "%23");
      assertNotNull(stringBuffer0);
      assertEquals(5, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = target0.__target__((StringBuffer) null, "$\"]4'[K#tJ>V_f");
      assertEquals("$\"]4'[K%23tJ>V_f", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = target0.__target__((StringBuffer) null, "XUTu/2B F7;u1}");
      assertNotNull(stringBuffer0);
      assertEquals(18, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = target0.__target__((StringBuffer) null, "");
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = target0.__target__((StringBuffer) null, ":M;n\r");
      StringBuffer stringBuffer1 = target0.__target__(stringBuffer0, ":M;n\r");
      assertNotNull(stringBuffer1);
      assertEquals(":M%3Bn\r:M%3Bn\r", stringBuffer0.toString());
      assertEquals(14, stringBuffer0.length());
  }
}
