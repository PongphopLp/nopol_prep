/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 03:32:47 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(3465);
      TimeZone timeZone0 = target0.__target__(integer0);
      assertNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      TimeZone timeZone0 = target0.__target__(object0);
      assertNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeZone timeZone1 = target0.__target__(timeZone0);
      assertSame(timeZone0, timeZone1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      TimeZone timeZone0 = target0.__target__((Object) null);
      assertNull(timeZone0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(0);
      TimeZone timeZone0 = target0.__target__(integer0);
      assertNull(timeZone0);
  }
}
