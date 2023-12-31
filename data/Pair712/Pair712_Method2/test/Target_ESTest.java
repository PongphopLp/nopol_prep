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
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        target0.__target__("00vMD7", byteArray0, 0, (-1340), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1340 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      int int0 = target0.__target__("-a&.e'= Tn", byteArray0, (byte)0, 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      int int0 = target0.__target__("jZJPOkH", byteArray0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[2];
      int int0 = target0.__target__("", byteArray0, (byte)0, (-896), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[6];
      int int0 = target0.__target__("/`9+YG)B4", byteArray0, (byte)108, (-1798), (-1798));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[19];
      int int0 = target0.__target__("lK89B[-p-g?f", byteArray0, (byte)2, 0, (byte)2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        target0.__target__("AgPH: ow]rV:", byteArray0, (-1749), (-1749), 965);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        target0.__target__((String) null, byteArray0, (byte)0, (byte)0, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        target0.__target__("DvJN 5A%nZf6b[ji\" T", byteArray0, (byte)2, (-3711), 112);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -3711 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[5];
      int int0 = target0.__target__("DvJN 5A%nZf6b[ji\" T", byteArray0, (byte) (-12), 112, 4016);
      assertEquals(0, int0);
  }
}
