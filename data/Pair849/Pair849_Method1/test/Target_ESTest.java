/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 22:46:33 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      String string0 = target0.__target__(hashtable0, "YN+V.", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Hashtable) null, (String) null, "");
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
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("\"eN}", target0);
      // Undeclared exception!
      try { 
        target0.__target__(hashtable0, "\"eN}", "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class java.lang.String (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @643ab701; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      String string0 = target0.__target__(hashtable0, "=iK`V)mZG3", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Hashtable<String, String> hashtable0 = new Hashtable<String, String>();
      hashtable0.put("", "-Jk_0V7W# D7,Q&\"");
      String string0 = target0.__target__(hashtable0, "", "");
      assertEquals("-Jk_0V7W# D7,Q&\"", string0);
  }
}
