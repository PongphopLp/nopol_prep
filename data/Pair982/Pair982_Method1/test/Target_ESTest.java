/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 12:34:26 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
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
      List<String> list0 = List.of("z+KN=/(<F#daUD", "", "${8a:}b|`6MIJ]", "");
      LinkedList<Object> linkedList0 = new LinkedList<Object>(list0);
      String[] stringArray0 = target0.__target__(linkedList0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String[] stringArray0 = target0.__target__(linkedList0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Stream<Object> stream0 = linkedList0.parallelStream();
      Object object0 = new Object();
      linkedList0.add(object0);
      List<Object> list0 = linkedList0.subList(1, 1);
      linkedList0.add((Object) stream0);
      // Undeclared exception!
      try { 
        target0.__target__(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Collection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      List<Object> list0 = List.of((Object) target0);
      // Undeclared exception!
      try { 
        target0.__target__(list0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class java.lang.String (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5c29801c; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      List<String> list0 = List.of("ke[@jlBRtW", "ke[@jlBRtW", "ke[@jlBRtW", "ke[@jlBRtW", "ke[@jlBRtW", ".KM}`g$0(7XgF", "ke[@jlBRtW", "ke[@jlBRtW");
      Target target0 = new Target();
      String[] stringArray0 = target0.__target__(list0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      List<String> list0 = List.of("", "", "lE0", "", "", "", "z+KN=/(<F#daUD");
      String[] stringArray0 = target0.__target__(list0);
      assertEquals(7, stringArray0.length);
  }
}
