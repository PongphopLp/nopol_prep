/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:55:41 GMT 2022
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
      Integer integer0 = new Integer(1794);
      Long long0 = target0.__target__(integer0);
      assertEquals(1794L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer((-283));
      Long long0 = target0.__target__(integer0);
      assertEquals((-283L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        target0.__target__(object0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.lang.Object@0000000002\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = target0.__target__((Object) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(0);
      Long long0 = target0.__target__(integer0);
      Long long1 = target0.__target__(long0);
      assertEquals(0L, (long)long1);
  }
}