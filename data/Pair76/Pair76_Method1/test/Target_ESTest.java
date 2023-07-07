/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 17:51:41 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
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
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList1.addFirst(target0);
      boolean boolean0 = target0.__target__(linkedList0, linkedList1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      // Undeclared exception!
      try { 
        target0.__target__(linkedList0, linkedList0);
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
      Object object0 = new Object();
      Integer integer0 = new Integer((-2849));
      List<Object> list0 = List.of(object0, (Object) integer0, (Object) integer0, object0, (Object) integer0, object0, (Object) integer0);
      Object object1 = new Object();
      List<Object> list1 = List.of(object0, (Object) integer0, (Object) integer0, object1, (Object) integer0, object0, (Object) integer0);
      boolean boolean0 = target0.__target__(list1, list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = List.of((Object) target0);
      boolean boolean0 = target0.__target__(list0, linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = target0.__target__(linkedList0, (Collection) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((Collection) null, (Collection) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = target0.__target__((Collection) null, linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Integer integer0 = new Integer((-2849));
      List<Object> list0 = List.of(object0, (Object) integer0, (Object) integer0, object0, (Object) integer0, object0, (Object) integer0);
      boolean boolean0 = target0.__target__(list0, list0);
      assertTrue(boolean0);
  }
}
