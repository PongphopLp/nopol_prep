/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 00:16:25 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      int int0 = target0.__target__(linkedList0, object0, comparator0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      // Undeclared exception!
      try { 
        target0.__target__(linkedList0, object0, (Comparator) null);
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
      Integer integer0 = new Integer(0);
      List<Integer> list0 = List.of(integer0, integer0, integer0, integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      int int0 = target0.__target__(list0, integer0, comparator0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer((-3));
      List<Integer> list0 = List.of(integer0, integer0, integer0, integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-3), 0).when(comparator0).compare(any() , any());
      int int0 = target0.__target__(list0, list0, comparator0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(8);
      List<Integer> list0 = List.of(integer0, integer0, integer0, integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(8, 0).when(comparator0).compare(any() , any());
      int int0 = target0.__target__(list0, comparator0, comparator0);
      assertEquals(0, int0);
  }
}
