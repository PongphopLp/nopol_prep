/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:32:57 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("33", 0, 33, false, false, "Z{~)+X ", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("1", 1, 2555, false, true, "", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1", 1, 2457, true, true, (String) null, arrayList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("", 1, 1826, true, true, "", arrayList0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("1", 0, 0, true, false, "", (ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1", (-1771), 1, true, true, (String) null, arrayList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1", 4, 4, false, false, "", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1", 4, 4, true, true, "", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1", 0, 0, true, true, "", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("3", 1, 19, true, false, "3", arrayList0);
      assertTrue(boolean0);
  }
}
