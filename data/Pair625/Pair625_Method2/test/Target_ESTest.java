/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 17:38:16 GMT 2022
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
      byte[] byteArray0 = new byte[37];
      byteArray0[1] = (byte) (-15);
      int int0 = target0.__target__(byteArray0, 0, 5, byteArray0, 5, 5, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-76);
      byteArray0[2] = (byte) (-123);
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (byte)0, (byte)0, byteArray0, (byte)0, (-866), (byte) (-76));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      int int0 = target0.__target__(byteArray0, 5, 0, byteArray0, (byte) (-15), (-7), 5);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      int int0 = target0.__target__(byteArray0, (-955), (-1263), byteArray0, 0, 0, 11);
      assertEquals((-1263), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      int int0 = target0.__target__(byteArray0, (byte) (-15), 5, byteArray0, (byte)0, 0, 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, (byte)1, 3830, (byte[]) null, 3830, (-1), (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      byteArray0[1] = (byte) (-15);
      // Undeclared exception!
      try { 
        target0.__target__(byteArray0, 0, 1043, byteArray0, 0, 21, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 37 out of bounds for length 37
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      byteArray0[0] = (byte) (-1);
      int int0 = target0.__target__(byteArray0, (byte)0, 0, byteArray0, (byte)0, (-28), (byte) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      int int0 = target0.__target__(byteArray0, (-76), 5, byteArray0, 0, 0, (-3565));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      int int0 = target0.__target__(byteArray0, 31, 5, byteArray0, 5, 5, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      byte[] byteArray0 = new byte[37];
      int int0 = target0.__target__(byteArray0, (-76), 0, byteArray0, (-1058), 1624, 0);
      assertEquals((-1), int0);
  }
}
