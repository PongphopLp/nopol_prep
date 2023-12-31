/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 13:46:02 GMT 2022
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
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 1588, 2770);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1588 out of bounds for length 2
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      int[] intArray1 = target0.__target__(intArray0, 0, (-1));
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, (-513), (-513));
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
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 0, (-935));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -934
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      int[] intArray1 = target0.__target__(intArray0, 0, 0);
      assertEquals(1, intArray1.length);
  }
}
