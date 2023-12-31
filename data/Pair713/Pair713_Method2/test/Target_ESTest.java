/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 23:43:34 GMT 2022
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
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        target0.__target__("JGR|chf9Y@", byteArray0, (byte)2, (-396), 51);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -396 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      int int0 = target0.__target__("Target", byteArray0, (byte)0, (byte)1, 102);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      int int0 = target0.__target__("0n{BuxA/v", byteArray0, 0, (byte)0, 3396);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      int int0 = target0.__target__("", byteArray0, 0, 0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      int int0 = target0.__target__("JGR|chf9Y@", byteArray0, (-1581), (byte)36, 3036);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        target0.__target__("AkVO-4|,81f W1Bz3re?", byteArray0, (-1), (-1), 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("3v", (byte[]) null, 5, 5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[4];
      int int0 = target0.__target__("AkVO-4|,81f W1Bz3re?", byteArray0, 4, (byte)0, 97);
      assertArrayEquals(new byte[] {(byte) (-127), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, int0);
  }
}
