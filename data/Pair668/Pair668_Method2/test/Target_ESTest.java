/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 20:44:55 GMT 2022
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
      StringBuffer stringBuffer0 = target0.__target__("", (StringBuffer) null);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("}", (StringBuffer) null);
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
      target0.__target__(" Ll0>?0eD>|", stringBuffer0);
      assertEquals(17, stringBuffer0.length());
      assertEquals(" Ll0&gt;?0eD&gt;|", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer();
      target0.__target__("*`\"0LlG,/q<b(h", stringBuffer0);
      assertEquals("*&apos;&quot;0LlG,/q&lt;b(h", stringBuffer0.toString());
      assertEquals(28, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "'R-%H{p4\"+Ria=m");
      target0.__target__("'R-%H{p4\"+Ria=m", stringBuffer0);
      assertEquals(42, stringBuffer0.length());
      assertEquals("'R-%H{p4\"+Ria=m&apos;R-%H{p4&quot;+Ria=m", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer("");
      target0.__target__("&gt;", stringBuffer0);
      assertEquals("&amp;gt;", stringBuffer0.toString());
      assertEquals(8, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      StringBuffer stringBuffer1 = target0.__target__((String) null, stringBuffer0);
      assertSame(stringBuffer0, stringBuffer1);
  }
}
