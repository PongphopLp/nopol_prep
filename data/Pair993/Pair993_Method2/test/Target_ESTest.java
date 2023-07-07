/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 13:30:21 GMT 2022
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
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)32;
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(byteArray0, intArray0, (byte)84, (byte)6, 1, (byte) (-1));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 536870912}, intArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)31;
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(byteArray0, intArray0, (byte)84, (byte)6, 1, (byte) (-1));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 2031616}, intArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(byteArray0, intArray0, (byte)84, (byte)6, 1, (byte) (-1));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 65280}, intArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[7];
      int int0 = target0.__target__(byteArray0, intArray0, 0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (int[]) null, 2953, 2953, 2953, 2953);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, intArray0, (byte)8, 0, 24, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      int int0 = target0.__target__((byte[]) null, intArray0, (-2944), (byte) (-1), (-2215), (byte)10);
      assertEquals((-8860), int0);
  }
}
