/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:16:36 GMT 2022
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
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(2869, 1936, 981, 981, 0, 981);
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-4916), 4479, 404);
      MockDate mockDate1 = new MockDate(371, 3723, (-1908));
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-2118), 29, (-1), (-2118), (-3436));
      mockDate0.setTime(2089L);
      MockDate mockDate1 = new MockDate(15, (-2118), 1, 29, 15, 15);
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      MockDate mockDate1 = new MockDate(0, 1422, (-599), 2371, 1);
      boolean boolean0 = target0.__target__(mockDate1, mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(15, (-2118), 1, 29, 15, 15);
      MockDate mockDate1 = new MockDate((-290), 1, 1, 1, 1561, 3723);
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate((-2118), 29, (-1), (-2118), (-3436));
      MockDate mockDate1 = new MockDate(15, (-2118), 1, 29, 15, 15);
      boolean boolean0 = target0.__target__(mockDate0, mockDate1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate(589, (-1908), 589, (-1908), (-1908));
      boolean boolean0 = target0.__target__(mockDate0, (Date) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = target0.__target__(mockDate0, mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      MockDate mockDate0 = new MockDate();
      boolean boolean0 = target0.__target__((Date) null, mockDate0);
      assertFalse(boolean0);
  }
}
