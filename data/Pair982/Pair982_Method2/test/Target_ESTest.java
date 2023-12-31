/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 12:35:52 GMT 2022
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
      List<String> list0 = List.of("", "", "b{E}5}bLHQ<-", "Target", "", "", "", "~A^:p^`+G");
      String[] stringArray0 = target0.__target__(list0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String[] stringArray0 = target0.__target__(linkedList0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "");
      linkedList0.offerLast((Object) null);
      // Undeclared exception!
      try { 
        target0.__target__(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      List<Object> list0 = List.of((Object) target0, (Object) target0);
      // Undeclared exception!
      try { 
        target0.__target__(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class java.lang.String (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @2c2879f5; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      List<String> list0 = List.of("Targ]t", "Targ]t", "", "", "", "Targ]t");
      String[] stringArray0 = target0.__target__(list0);
      assertEquals(6, stringArray0.length);
  }
}
