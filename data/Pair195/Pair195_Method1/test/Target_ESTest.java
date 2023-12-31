/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 00:32:55 GMT 2022
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
      char[] charArray0 = new char[2];
      char[] charArray1 = new char[6];
      charArray1[0] = '3';
      int int0 = target0.__target__(charArray0, charArray1);
      assertEquals((-51), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[0];
      char[] charArray1 = new char[2];
      int int0 = target0.__target__(charArray0, charArray1);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((char[]) null, (char[]) null);
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
      char[] charArray0 = new char[2];
      charArray0[0] = '3';
      char[] charArray1 = new char[1];
      int int0 = target0.__target__(charArray0, charArray1);
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      int int0 = target0.__target__(charArray0, charArray0);
      assertEquals(0, int0);
  }
}
