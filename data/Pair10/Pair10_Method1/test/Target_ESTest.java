/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 10:59:06 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.addLast((Object) null);
      String string0 = target0.__target__(linkedList0, "10.A/~G48");
      assertEquals("null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      List<Object> list0 = List.of((Object) "X", (Object) target0, (Object) "X", object0, object0, object0, (Object) target0, (Object) "");
      // Undeclared exception!
      try { 
        target0.__target__(list0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class java.lang.String (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @3bec7a45; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      List<String> list0 = List.of("");
      String string0 = target0.__target__(list0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string0 = target0.__target__(linkedList0, "Target");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((List) null, "[Zyz^");
      assertNull(string0);
  }
}
