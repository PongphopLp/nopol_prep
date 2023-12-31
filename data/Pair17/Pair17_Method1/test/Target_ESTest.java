/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 12:14:24 GMT 2022
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
      byteArray0[5] = (byte)5;
      int[] intArray0 = target0.__target__(byteArray0, (byte)2, (byte)5);
      assertArrayEquals(new int[] {5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)8;
      int[] intArray0 = target0.__target__(byteArray0, (byte)2, (byte)5);
      assertArrayEquals(new int[] {2048}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, 0, 3054);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 8 out of bounds for length 8
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte) (-57);
      int[] intArray0 = target0.__target__(byteArray0, (byte)2, (byte)5);
      assertArrayEquals(new int[] {13041664}, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-11);
      int[] intArray0 = target0.__target__(byteArray0, (byte)2, (byte)5);
      assertArrayEquals(new int[] {(-184549376)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, 8, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = target0.__target__(byteArray0, 1, 1);
      assertArrayEquals(new int[] {}, intArray0);
  }
}
