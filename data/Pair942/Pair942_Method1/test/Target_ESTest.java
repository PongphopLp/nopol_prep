/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 08:18:29 GMT 2022
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
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 6);
      // Undeclared exception!
      try { 
        target0.__target__(mockDate0, (Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      MockDate mockDate1 = new MockDate(0, (-1), 0, 0, 0);
      int int0 = target0.__target__(mockDate0, mockDate1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), 0, (-1), (-1), (-1));
      MockDate mockDate1 = new MockDate((-1), (-1), (-1), 351, 0);
      Target target0 = new Target();
      int int0 = target0.__target__(mockDate1, mockDate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Instant instant0 = MockInstant.ofEpochSecond(152L);
      Date date0 = Date.from(instant0);
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 6);
      int int0 = target0.__target__(date0, mockDate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Instant instant0 = MockInstant.ofEpochSecond(152L);
      Date date0 = Date.from(instant0);
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 6);
      int int0 = target0.__target__(mockDate0, date0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      int int0 = target0.__target__(mockDate0, mockDate0);
      assertEquals(0, int0);
  }
}
