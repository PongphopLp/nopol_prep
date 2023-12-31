/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 14:04:58 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), 1, 9);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("2-02-09", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1900, 1900, 1900, 1571, 0, 9);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("2063-09-16", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Calendar) null);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3211, 3211, 3211);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        target0.__target__(mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 2, 2, 2, 2);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("2-03-02", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("2-12-31", string0);
  }
}
