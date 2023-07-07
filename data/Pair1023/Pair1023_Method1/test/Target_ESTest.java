/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 14:01:31 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(478, 478, 3244, 478, 3244);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("0526-10-10", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(10, 1, (-1), 2, 8, 1);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("0010-01-30", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1385, (-5349), 0, 1385, 0);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("0100-10-07", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(928, 850, 928, (-4587), 1362, 1362);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("1000-11-06", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3134, 3134, 3134, 3134, 515);
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
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("0001-02-01", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(23, 23, 23);
      String string0 = target0.__target__(mockGregorianCalendar0);
      assertEquals("0024-12-23", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      Locale locale0 = new Locale("9YCJQeDP");
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      String string0 = target0.__target__(calendar0);
      assertEquals("2014-02-14", string0);
  }
}
