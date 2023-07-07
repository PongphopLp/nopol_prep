/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 05:33:47 GMT 2022
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put((String) null, "zrs{RYA7b9)");
      String string0 = target0.__target__(hashMap0, (String) null);
      assertEquals("zrs{RYA7b9)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Map) null, "nlwf^LYx6eZL-");
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("", "");
      String string0 = target0.__target__(hashMap0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = target0.__target__(hashMap0, "eQ8K5Wl#x5~E");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("x';2YC8DG", target0);
      String string0 = target0.__target__(hashMap0, "x';2YC8DG");
      assertNull(string0);
  }
}