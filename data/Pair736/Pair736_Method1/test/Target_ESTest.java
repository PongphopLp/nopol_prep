/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 02:17:35 GMT 2022
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
      short[] shortArray0 = new short[6];
      shortArray0[1] = (short) (-860);
      shortArray0[2] = (short) (-1);
      shortArray0[3] = (short) (-1);
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, 1, 537);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[7];
      shortArray0[3] = (short)704;
      shortArray0[4] = (short)2220;
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, (short)1, (short)704);
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
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)1;
      shortArray0[1] = (short) (-1820);
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, (short)1, (short)704);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 7 out of bounds for length 7
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[6];
      shortArray0[2] = (short)1;
      shortArray0[3] = (short)2783;
      shortArray0[4] = (short) (-1110);
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, (short)1832, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[6];
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, (short)2059, (short)2059);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2059 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[1];
      double double0 = target0.__target__(shortArray0, (-907), (short) (-1110));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((short[]) null, 1736, 1736);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[6];
      shortArray0[0] = (short)2032;
      shortArray0[1] = (short)1;
      shortArray0[2] = (short)2032;
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, (short)1, 1013);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[6];
      shortArray0[1] = (short) (-1110);
      shortArray0[2] = (short)1;
      shortArray0[3] = (short)2783;
      // Undeclared exception!
      try { 
        target0.__target__(shortArray0, (short)1832, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 6 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[6];
      shortArray0[1] = (short)1;
      shortArray0[2] = (short)1;
      double double0 = target0.__target__(shortArray0, 5, (short)1);
      assertEquals(0.039788735772973836, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      short[] shortArray0 = new short[6];
      target0.__target__(shortArray0, 3304, (short) (-1));
      target0.__target__(shortArray0, 3333, (-1427));
      target0.__target__(shortArray0, 3333, (short) (-3390));
      // Undeclared exception!
      target0.__target__(shortArray0, 3272, (-1));
  }
}