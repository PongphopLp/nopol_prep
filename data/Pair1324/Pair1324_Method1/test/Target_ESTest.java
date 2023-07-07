/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 12:07:55 GMT 2022
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
      MockDate mockDate0 = new MockDate((-4163), (-4163), (-4163), (-1066), 0, 0);
      MockDate mockDate1 = new MockDate((-1066), (-1066), (-1), (-4163), 651, (-1));
      Date date0 = target0.__target__(mockDate0, mockDate1);
      assertEquals("Sun Sep 06 23:50:59 GMT 744", date0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(2026, 2026, 1, 2026, 269, 227);
      MockDate mockDate1 = new MockDate(2026, 2026, (-3183), (-5559), 4048);
      Date date0 = target0.__target__(mockDate0, mockDate1);
      assertEquals("Mon Jan 24 14:32:47 GMT 4095", date0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-4163), (-4163), (-4163), (-1066), 0, 0);
      Date date0 = target0.__target__(mockDate0, (Date) null);
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
      MockDate mockDate0 = new MockDate();
      Date date0 = target0.__target__(mockDate0, mockDate0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }
}