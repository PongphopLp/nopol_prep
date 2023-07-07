/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 14:37:27 GMT 2022
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
      char[] charArray0 = new char[4];
      char[] charArray1 = new char[4];
      charArray1[0] = 'U';
      boolean boolean0 = target0.__target__(charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[8];
      char[] charArray1 = new char[1];
      boolean boolean0 = target0.__target__(charArray1, charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        target0.__target__(charArray0, (char[]) null);
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
      char[] charArray0 = new char[4];
      charArray0[0] = 'U';
      char[] charArray1 = new char[4];
      boolean boolean0 = target0.__target__(charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[8];
      char[] charArray1 = new char[9];
      boolean boolean0 = target0.__target__(charArray1, charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[9];
      boolean boolean0 = target0.__target__(charArray0, charArray0);
      assertTrue(boolean0);
  }
}
