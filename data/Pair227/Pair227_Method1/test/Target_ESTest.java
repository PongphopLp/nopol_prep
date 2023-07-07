/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 01:19:38 GMT 2022
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
      int[] intArray0 = new int[2];
      intArray0[1] = 4261;
      boolean boolean0 = target0.__target__(intArray0, 0, intArray0, 1, 1296);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, (-635), (int[]) null, (-949), 540);
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
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 1, intArray0, 4261, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4261 out of bounds for length 2
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[8];
      intArray1[1] = 1;
      boolean boolean0 = target0.__target__(intArray1, 0, intArray0, 0, 1843);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[6];
      boolean boolean0 = target0.__target__(intArray0, 0, intArray0, 0, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[0];
      boolean boolean0 = target0.__target__(intArray0, 0, intArray0, (-863), (-863));
      assertTrue(boolean0);
  }
}
