/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 01:01:41 GMT 2022
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
      long[] longArray0 = new long[0];
      long[] longArray1 = target0.__target__(longArray0, 1);
      assertEquals(1, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[0];
      long[] longArray1 = target0.__target__(longArray0, 0);
      assertEquals(0, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((long[]) null, 721);
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
      long[] longArray0 = new long[2];
      long[] longArray1 = target0.__target__(longArray0, 3673);
      assertEquals(3673, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[2];
      long[] longArray1 = target0.__target__(longArray0, 3);
      assertEquals(4, longArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[0];
      long[] longArray1 = target0.__target__(longArray0, (-579));
      assertEquals(0, longArray1.length);
  }
}