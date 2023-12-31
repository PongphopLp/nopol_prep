/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 02:41:50 GMT 2022
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
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      byte[] byteArray1 = new byte[2];
      byte[] byteArray2 = target0.__target__(byteArray0, byteArray1, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-1)}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[0];
      byte[] byteArray2 = target0.__target__(byteArray0, byteArray0, byteArray1);
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      Target target0 = new Target();
      byte[] byteArray1 = new byte[1];
      byte[] byteArray2 = target0.__target__(byteArray0, byteArray1, byteArray0);
      byte[] byteArray3 = target0.__target__(byteArray2, byteArray1, byteArray0);
      // Undeclared exception!
      target0.__target__(byteArray3, byteArray2, byteArray2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((byte[]) null, (byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)59;
      byte[] byteArray1 = new byte[4];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, byteArray1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
