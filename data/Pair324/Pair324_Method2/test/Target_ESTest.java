/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 11:30:39 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
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
      List list0 = target0.__target__(linkedList0, linkedList0);
      Object object0 = new Object();
      Integer integer0 = new Integer((-5730));
      List<Object> list1 = List.of((Object) list0, object0, (Object) list0, object0, (Object) list0, (Object) list0, (Object) list0, (Object) integer0);
      target0.__target__(list0, list1);
      assertTrue(linkedList0.contains((-5730)));
      assertEquals(8, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      List<Integer> list0 = List.of();
      // Undeclared exception!
      try { 
        target0.__target__(list0, list0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ImmutableCollections", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List list0 = target0.__target__(linkedList0, (List) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List list0 = target0.__target__(linkedList0, linkedList0);
      List<Object> list1 = linkedList0.subList(0, 0);
      linkedList0.add((Object) list1);
      // Undeclared exception!
      try { 
        target0.__target__(list1, list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      List list0 = target0.__target__((List) null, (List) null);
      assertNull(list0);
  }
}
