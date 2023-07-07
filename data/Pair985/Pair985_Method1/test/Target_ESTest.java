/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 12:45:24 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, 9, 9, 9, 9);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("9-10-09", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((GregorianCalendar) null);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1270, 1270, 1270);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1967), 958, 10, (-1), (-623), (-1967));
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("1889-11-09", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 559, 10, 1, 559, 1);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("56-08-10", string0);
  }
}
