/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 23:39:32 GMT 2022
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
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(1142);
      hashMap0.put("", integer0);
      int int0 = target0.__target__(hashMap0, "");
      assertEquals(1142, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Map) null, "!O1F\"^Lq/;^h)p");
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("VIHMTA", "");
      int int0 = target0.__target__(hashMap0, "VIHMTA");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer((-291));
      hashMap0.put("", integer0);
      int int0 = target0.__target__(hashMap0, "");
      assertEquals((-291), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      int int0 = target0.__target__(hashMap0, "2@J=SqPb+GQ#lKCD");
      assertEquals(0, int0);
  }
}
