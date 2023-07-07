/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 20:06:27 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = target0.__target__(booleanArray0, booleanArray0);
      assertNotSame(booleanArray0, booleanArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((boolean[]) null, (boolean[]) null);
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
      boolean[] booleanArray0 = new boolean[0];
      boolean[] booleanArray1 = new boolean[7];
      booleanArray1[0] = true;
      // Undeclared exception!
      try { 
        target0.__target__(booleanArray1, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = true;
      boolean[] booleanArray2 = target0.__target__(booleanArray1, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {false}, booleanArray2));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      boolean[] booleanArray1 = target0.__target__(booleanArray0, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {true}, booleanArray1));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean[] booleanArray0 = new boolean[1];
      boolean[] booleanArray1 = target0.__target__(booleanArray0, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {false}, booleanArray1));
  }
}
