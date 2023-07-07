/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 10:54:19 GMT 2022
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
      Object[] objectArray0 = new Object[1];
      Object[] objectArray1 = new Object[0];
      boolean boolean0 = target0.__target__(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) target0;
      Object[] objectArray1 = new Object[7];
      boolean boolean0 = target0.__target__(objectArray0, objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) target0;
      Object[] objectArray1 = new Object[7];
      objectArray1[0] = (Object) target0;
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, objectArray1);
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
      Object[] objectArray0 = new Object[7];
      Object[] objectArray1 = new Object[1];
      boolean boolean0 = target0.__target__(objectArray1, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = target0.__target__(objectArray0, (Object[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[7];
      boolean boolean0 = target0.__target__((Object[]) null, objectArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((Object[]) null, (Object[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[0];
      Object[] objectArray1 = new Object[0];
      boolean boolean0 = target0.__target__(objectArray1, objectArray0);
      assertTrue(boolean0);
  }
}
