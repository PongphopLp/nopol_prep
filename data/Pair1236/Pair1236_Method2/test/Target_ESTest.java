/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 09:50:08 GMT 2022
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
      String string0 = target0.__target__("(R", "(R", "");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, "", "Target");
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
      String string0 = target0.__target__("`+k'wWI1Qbs^kX0/5", "`+k'wWI1Qbs^kX0/5", "`+k'wWI1Qbs^kX0/5");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("3b}wB", "", "}");
      assertEquals("3b", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("", "(R", "(R");
      assertNull(string0);
  }
}