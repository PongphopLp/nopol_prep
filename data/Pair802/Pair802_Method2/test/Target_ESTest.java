/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 10:18:54 GMT 2022
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
      long[] longArray0 = new long[4];
      longArray0[0] = 310L;
      long long0 = target0.__target__(longArray0);
      assertEquals(310L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[3];
      longArray0[0] = (-961L);
      longArray0[1] = (-1286L);
      longArray0[2] = (-1L);
      long long0 = target0.__target__(longArray0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((long[]) null);
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
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        target0.__target__(longArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      long[] longArray0 = new long[10];
      longArray0[0] = (-2374L);
      long long0 = target0.__target__(longArray0);
      assertEquals(0L, long0);
  }
}
