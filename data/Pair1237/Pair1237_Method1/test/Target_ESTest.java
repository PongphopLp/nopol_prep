/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 03:32:31 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(0);
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
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(3982, "V.e8TV&ONZi");
      TimeZone timeZone0 = target0.__target__(simpleTimeZone0);
      assertSame(simpleTimeZone0, timeZone0);
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
      Integer integer0 = Integer.getInteger("V.e8TV&ONZi", 916);
      TimeZone timeZone0 = target0.__target__(integer0);
      assertNull(timeZone0);
  }
}
