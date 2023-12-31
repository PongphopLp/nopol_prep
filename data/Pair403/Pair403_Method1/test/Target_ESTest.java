/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 17:56:07 GMT 2022
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
      String[] stringArray0 = new String[8];
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put((Object) null, target0);
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class [Ljava.lang.String; (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @c306e8; [Ljava.lang.String; is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[2];
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put(target0, target0);
      String[] stringArray1 = target0.__target__(stringArray0, hashMap0);
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      String[] stringArray1 = target0.__target__(stringArray0, (Map) null);
      assertSame(stringArray0, stringArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[0];
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      String[] stringArray1 = target0.__target__(stringArray0, hashMap0);
      assertSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[2];
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      String[] stringArray1 = target0.__target__(stringArray0, hashMap0);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      String[] stringArray0 = target0.__target__((String[]) null, hashMap0);
      assertNull(stringArray0);
  }
}
