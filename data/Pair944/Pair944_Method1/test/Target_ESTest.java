/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 08:18:30 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(3302, 3302, (-430), 1076, 0, 0);
      int int0 = target0.__target__(mockDate1, mockDate0);
      assertEquals((-3462), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate((-1062), 2306, 1, 0, (-550), (-550));
      int int0 = target0.__target__(mockDate1, mockDate0);
      assertEquals(983, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        target0.__target__((Date) null, mockDate0);
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
      MockDate mockDate0 = new MockDate(1, 1, 1, 1, 1);
      MockDate mockDate1 = new MockDate();
      int int0 = target0.__target__(mockDate1, mockDate0);
      assertEquals((-114), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(148L);
      int int0 = target0.__target__(mockDate0, mockDate1);
      assertEquals((-45), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      int int0 = target0.__target__(mockDate0, mockDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      Instant instant0 = MockInstant.ofEpochSecond((long) (-1593), 1097L);
      Date date0 = Date.from(instant0);
      int int0 = target0.__target__(mockDate0, date0);
      assertEquals((-45), int0);
  }
}
