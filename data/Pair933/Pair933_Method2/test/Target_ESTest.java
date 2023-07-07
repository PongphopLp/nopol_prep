/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 07:00:31 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Hashtable<Integer, Integer> hashtable0 = new Hashtable<Integer, Integer>();
      // Undeclared exception!
      try { 
        target0.__target__((Enumeration) null, hashtable0, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      hashtable0.put(target0, target0);
      Enumeration<Object> enumeration0 = hashtable0.keys();
      // Undeclared exception!
      try { 
        target0.__target__(enumeration0, hashtable0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class java.lang.String (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @6f423536; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      StringTokenizer stringTokenizer0 = new StringTokenizer("`O'{Gd_CG-jDKY7FJ");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      Integer integer0 = new Integer(2);
      hashtable0.put("`O'{Gd_CG-jDKY7FJ", integer0);
      Hashtable<Object, Integer> hashtable1 = new Hashtable<Object, Integer>();
      int int0 = target0.__target__(stringTokenizer0, hashtable0, hashtable1);
      assertEquals(0, stringTokenizer0.countTokens());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      StringTokenizer stringTokenizer0 = new StringTokenizer("ug[brd");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      Integer integer0 = new Integer(2332);
      hashtable0.put("ug[brd", integer0);
      int int0 = target0.__target__(stringTokenizer0, hashtable0, hashtable0);
      assertEquals(0, stringTokenizer0.countTokens());
      assertEquals(1166, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      StringTokenizer stringTokenizer0 = new StringTokenizer("ug[brd");
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      int int0 = target0.__target__(stringTokenizer0, hashtable0, hashtable0);
      assertEquals(0, stringTokenizer0.countTokens());
      assertEquals(0, int0);
  }
}
