/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 12:08:36 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
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
      MockDate mockDate0 = new MockDate(0L);
      MockDate mockDate1 = new MockDate();
      Date date0 = target0.__target__(mockDate1, mockDate0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = target0.__target__(mockDate0, (Date) null);
      assertSame(mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      Date date0 = target0.__target__((Date) null, mockDate0);
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Date date0 = target0.__target__((Date) null, (Date) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(1351, 1351, 1351);
      Date date0 = target0.__target__(mockDate0, mockDate0);
      assertEquals("Sun Apr 12 00:00:00 GMT 3367", date0.toString());
  }
}