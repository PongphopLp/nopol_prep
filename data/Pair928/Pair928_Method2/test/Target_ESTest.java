/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 06:09:01 GMT 2022
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
      stringBuffer0.setLength(5061);
      target0.__target__(stringBuffer0);
      // Undeclared exception!
      target0.__target__(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer();
      char[] charArray0 = new char[4];
      stringBuffer0.appendCodePoint(10);
      charArray0[0] = ' ';
      stringBuffer0.append(charArray0);
      String string0 = target0.__target__(stringBuffer0);
      assertEquals(4, stringBuffer0.length());
      assertEquals(" \u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer();
      stringBuffer0.appendCodePoint(10);
      String string0 = target0.__target__(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer(" $l");
      String string0 = target0.__target__(stringBuffer0);
      assertEquals("$l", stringBuffer0.toString());
      assertEquals("$l", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      StringBuffer stringBuffer0 = new StringBuffer();
      String string0 = target0.__target__(stringBuffer0);
      assertEquals("", string0);
  }
}