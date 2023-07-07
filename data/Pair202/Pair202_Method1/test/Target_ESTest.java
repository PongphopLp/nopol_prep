/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 21:43:06 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      // Undeclared exception!
      try { 
        target0.__target__((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Locale locale0 = Locale.ITALY;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        target0.__target__(locale0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.util.Locale cannot be cast to class java.util.Calendar (java.util.Locale and java.util.Calendar are in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(379, 379, 379, 379, 3827);
      int int0 = target0.__target__(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1174), (-1174), 0, 0, (-793), 2888);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      int int0 = target0.__target__(mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Locale locale0 = Locale.ITALY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      int int0 = target0.__target__(mockGregorianCalendar0, mockGregorianCalendar0);
      assertEquals(0, int0);
  }
}
