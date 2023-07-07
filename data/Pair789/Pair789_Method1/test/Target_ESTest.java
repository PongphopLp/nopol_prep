/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 09:16:13 GMT 2022
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
      int[] intArray0 = new int[1];
      String string0 = target0.__target__("", ".", "", intArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("", "", "tL`1k;c>~)}q_f(", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        target0.__target__("!}jQVV*_#", "_", "", intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      String string0 = target0.__target__("}a", "3", "uy50+e{I7~syYh+", intArray0);
      assertEquals("}a", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      String string0 = target0.__target__((String) null, "7/.Vxhy*Y&CDYe7Zm", "7/.Vxhy*Y&CDYe7Zm", intArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      String string0 = target0.__target__(";-:vW=3~pq.q^t3N?", "3", "}a", intArray0);
      assertEquals(";-:vW=}a~pq.q^t}aN?", string0);
      assertArrayEquals(new int[] {2, 0}, intArray0);
  }
}
