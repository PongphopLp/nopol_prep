/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 05:32:53 GMT 2022
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
      hashMap0.put("vk|:3^25tA)0]-g", "vk|:3^25tA)0]-g");
      hashMap0.put("", "lMC]&]WP");
      String string0 = target0.__target__(hashMap0, "vk|:3^25tA)0]-g.");
      assertEquals("vk|:3^25tA)0]-g", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      hashMap0.put((Object) null, object0);
      // Undeclared exception!
      try { 
        target0.__target__(hashMap0, ".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      hashMap0.put(object0, target0);
      // Undeclared exception!
      try { 
        target0.__target__(hashMap0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "lMC]&]WP");
      String string0 = target0.__target__(hashMap0, ">B.,/d#Q~R!}Hd#!}h");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vk|:3^25tA)0]-g", "vk|:3^25tA)0]-g");
      String string0 = target0.__target__(hashMap0, "?,3]vF'Yq");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "lMC]&]WP");
      String string0 = target0.__target__(hashMap0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("vk|:3^25tA)0]-g", "vk|:3^25tA)0]-g");
      String string0 = target0.__target__(hashMap0, ">B.,/d#Q~R!}Hd#!}h");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = target0.__target__(hashMap0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((Map) null, "cmZ`A6CG#D9d");
      assertNull(string0);
  }
}
