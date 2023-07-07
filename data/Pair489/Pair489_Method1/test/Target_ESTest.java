/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 01:17:20 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = target0.__target__(hashMap0, "$G$4Lq|u6aeK-d<V3b", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = target0.__target__(hashMap0, "hqZcNTRS_;8tGxlC", "^{C8h4s*");
      assertEquals("^{C8h4s*", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Map<String, String>) null, "xMlorc?*l*", "xMlorc?*l*");
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = target0.__target__(hashMap0, (String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("t/N8", "");
      String string0 = target0.__target__(hashMap0, "t/N8", "");
      assertEquals("", string0);
  }
}
