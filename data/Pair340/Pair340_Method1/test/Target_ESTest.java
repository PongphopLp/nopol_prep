/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:16:35 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
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
      Instant instant0 = MockInstant.ofEpochSecond((-1779L));
      Date date0 = Date.from(instant0);
      MockDate mockDate0 = new MockDate(0, 0, 0);
      boolean boolean0 = target0.__target__(date0, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      MockDate mockDate1 = new MockDate();
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Instant instant0 = MockInstant.ofEpochSecond((-1779L));
      Date date0 = Date.from(instant0);
      MockDate mockDate0 = new MockDate(0, 0, 0);
      boolean boolean0 = target0.__target__(mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      MockDate mockDate1 = new MockDate();
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = target0.__target__(mockDate0, (Date) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Instant instant0 = MockInstant.ofEpochSecond((-1779L));
      Date date0 = Date.from(instant0);
      boolean boolean0 = target0.__target__(date0, date0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((Date) null, (Date) null);
      assertFalse(boolean0);
  }
}