/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 02:38:56 GMT 2022
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
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(intArray0, intArray0, (-1890), 1459);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[8];
      intArray0[0] = 980;
      int int0 = target0.__target__(intArray0, intArray0, 1, (-2168));
      assertEquals(979, int0);
      assertArrayEquals(new int[] {(-2124640), 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      int int0 = target0.__target__(intArray0, intArray0, 1, (-1));
      assertEquals((-2), int0);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, (int[]) null, 3161, 3161);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, intArray0, 1908, 1908);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }
}
