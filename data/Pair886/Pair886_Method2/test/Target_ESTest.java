/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 02:31:14 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Stream<Object> stream0 = linkedList0.stream();
      linkedList0.add((Object) stream0);
      int int0 = target0.__target__(linkedList0, stream0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Stream<Object> stream0 = linkedList0.stream();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.add((Object) stream0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        target0.__target__(list0, integer0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((List) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      List<Object> list0 = List.of((Object) target0, object0, (Object) target0, (Object) target0, (Object) target0, (Object) target0, object0, object0, object0);
      int int0 = target0.__target__(list0, object0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      List<Object> list0 = List.of((Object) target0, (Object) target0);
      int int0 = target0.__target__(list0, list0);
      assertEquals((-1), int0);
  }
}
