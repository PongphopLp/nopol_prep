/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 21:47:33 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
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
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        target0.__target__(object0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.util.Date (java.lang.Object and java.util.Date are in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(1L);
      int int0 = target0.__target__(mockDate0, mockDate1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      mockDate0.setTime((-5185L));
      MockDate mockDate1 = new MockDate((-1513L));
      int int0 = target0.__target__(mockDate0, mockDate1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      int int0 = target0.__target__(mockDate0, mockDate0);
      assertEquals(0, int0);
  }
}
