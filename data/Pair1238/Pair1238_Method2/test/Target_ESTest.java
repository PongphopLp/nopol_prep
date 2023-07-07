/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 03:34:12 GMT 2022
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
      char[] charArray0 = new char[5];
      charArray0[0] = 'P';
      charArray0[1] = '[';
      int int0 = target0.__target__("P[xOE4*M(u", charArray0, 0);
      assertEquals(120, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      charArray0[1] = '[';
      int int0 = target0.__target__("P[xOE4*M(u", charArray0, 1);
      assertEquals((-11), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("i", (char[]) null, 646);
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
      // Undeclared exception!
      try { 
        target0.__target__("", charArray0, 40);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 40 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      charArray0[3] = 'w';
      charArray0[4] = 'w';
      int int0 = target0.__target__("w", charArray0, 3);
      assertEquals((-119), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      charArray0[3] = 'w';
      int int0 = target0.__target__("w", charArray0, 3);
      assertEquals(0, int0);
  }
}
