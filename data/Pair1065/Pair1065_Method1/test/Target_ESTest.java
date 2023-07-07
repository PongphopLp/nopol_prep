/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 16:59:12 GMT 2022
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
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) target0;
      objectArray0[1] = (Object) target0;
      boolean boolean0 = target0.__target__(objectArray0, objectArray0[1]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) target0;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, object0);
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
      Object[] objectArray0 = new Object[2];
      boolean boolean0 = target0.__target__(objectArray0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = target0.__target__(objectArray0, target0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      boolean boolean0 = target0.__target__((Object[]) null, object0);
      assertFalse(boolean0);
  }
}
