/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:20:40 GMT 2022
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
      MockDate mockDate0 = new MockDate(27, 27, 27, 27, 27);
      MockDate mockDate1 = new MockDate(27, 27, 27);
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 0);
      MockDate mockDate1 = new MockDate(0, 0, 0, (-3292), (-3292), 0);
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-3219), (-3219), (-3219));
      MockDate mockDate1 = new MockDate();
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-22), (-22), (-22), (-22), (-22));
      MockDate mockDate1 = new MockDate((-22), (-22), (-22));
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 0);
      MockDate mockDate1 = new MockDate(0, 0, 5, (-3272), (-3272), (-15));
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-22), (-22), (-22), (-22), (-22));
      boolean boolean0 = target0.__target__(mockDate0, mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0L);
      MockDate mockDate1 = new MockDate(1829, 1829, 1841);
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }
}
