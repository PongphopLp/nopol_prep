/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:17:14 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      MockDate mockDate1 = new MockDate((-2320L));
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-538L));
      MockDate mockDate1 = new MockDate(1990L);
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Date) null, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      MockDate mockDate1 = new MockDate((-2320L));
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      boolean boolean0 = target0.__target__(mockDate0, mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      MockDate mockDate1 = new MockDate();
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }
}