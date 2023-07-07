/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 12:42:18 GMT 2022
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
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(intArray0, 0, 1, 0, false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(intArray0, 0, 1, 0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((int[]) null, 0, (-1643), 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 672, 63, (-499), false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -219 out of bounds for length 4
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      int int0 = target0.__target__(intArray0, 3, 0, 3, false);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      int int0 = target0.__target__(intArray0, (-27), 0, 1, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      int int0 = target0.__target__(intArray0, 1, 0, 1, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[20];
      int int0 = target0.__target__(intArray0, (-15), 0, 1, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      int int0 = target0.__target__(intArray0, 0, 0, 0, false);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[18];
      int int0 = target0.__target__(intArray0, 0, 0, 0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      int int0 = target0.__target__(intArray0, 0, 0, 1, false);
      assertEquals(0, int0);
  }
}
