/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 07:51:13 GMT 2022
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
      Object[] objectArray0 = new Object[9];
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, (Object[]) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      Target target0 = new Target();
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, objectArray0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[9];
      int[] intArray0 = new int[2];
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) target0;
      boolean boolean0 = target0.__target__(objectArray1, objectArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[9];
      objectArray0[4] = (Object) target0;
      int[] intArray0 = new int[2];
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = objectArray0[4];
      boolean boolean0 = target0.__target__(objectArray0, objectArray1, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) target0;
      int[] intArray0 = new int[1];
      boolean boolean0 = target0.__target__(objectArray0, objectArray0, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[2];
      int[] intArray0 = new int[2];
      boolean boolean0 = target0.__target__(objectArray0, objectArray0, intArray0);
      assertFalse(boolean0);
  }
}