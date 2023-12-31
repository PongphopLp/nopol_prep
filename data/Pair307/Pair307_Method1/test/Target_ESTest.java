/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 10:45:25 GMT 2022
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
      char[] charArray0 = new char[8];
      charArray0[0] = ' ';
      charArray0[1] = 'd';
      boolean boolean0 = target0.__target__(charArray0, ' ');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[9];
      boolean boolean0 = target0.__target__(charArray0, '\u0000');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((char[]) null, 14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      charArray0[0] = '\r';
      charArray0[1] = '\r';
      charArray0[2] = '\r';
      charArray0[3] = '\r';
      charArray0[4] = '\r';
      // Undeclared exception!
      try { 
        target0.__target__(charArray0, 1112);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 5 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[2];
      charArray0[0] = '\r';
      boolean boolean0 = target0.__target__(charArray0, '\r');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[7];
      charArray0[0] = '\n';
      boolean boolean0 = target0.__target__(charArray0, 9);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[8];
      charArray0[0] = '\t';
      boolean boolean0 = target0.__target__(charArray0, '\t');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[7];
      boolean boolean0 = target0.__target__(charArray0, (-1735));
      assertTrue(boolean0);
  }
}
