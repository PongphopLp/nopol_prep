/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 10:57:50 GMT 2022
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
      Object[] objectArray0 = new Object[3];
      Object[] objectArray1 = new Object[6];
      boolean boolean0 = target0.__target__(objectArray1, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[3];
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) target0;
      boolean boolean0 = target0.__target__(objectArray1, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, objectArray0);
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
      Object[] objectArray0 = new Object[3];
      Object[] objectArray1 = new Object[9];
      boolean boolean0 = target0.__target__(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[0];
      boolean boolean0 = target0.__target__(objectArray0, objectArray0);
      assertTrue(boolean0);
  }
}
