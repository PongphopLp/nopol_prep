/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 12:21:37 GMT 2022
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
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", (-438.1886), 4255.0, true, true, "2", arrayList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", 1471.4028025, 1471.4028025, false, false, "2", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", 2.0, (-438.1886), true, false, "2", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      // Undeclared exception!
      try { 
        target0.__target__("Target", (-1.0), 1.0, true, true, "", arrayList0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, 1216.4, 1216.4, true, true, (String) null, arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("2", (-1001.72192), 1301.06107, false, false, "2", arrayList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", 1.9385820520712103, 2.0, true, false, "", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", 2.0, 2.0, false, false, "!JxpaBl(2B\"q~TuN", arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", 1471.4028025, 1471.4028025, true, true, "2", arrayList0);
      assertFalse(arrayList0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", (-1549.1454303), (-1549.1454303), true, true, "2", arrayList0);
      assertEquals(1, arrayList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = target0.__target__("2", 1.939, 2.0, false, true, "BQlY~(m,!1c?biz", arrayList0);
      assertTrue(boolean0);
  }
}
