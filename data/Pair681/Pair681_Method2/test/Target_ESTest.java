/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 21:45:23 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer((-1602));
      Integer integer1 = new Integer((-1));
      boolean boolean0 = target0.__target__(integer1, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = Integer.valueOf(0);
      Integer integer1 = new Integer(2267);
      boolean boolean0 = target0.__target__(integer0, integer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Integer integer0 = Integer.valueOf(0);
      boolean boolean0 = target0.__target__(integer0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = Integer.valueOf(0);
      boolean boolean0 = target0.__target__(integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      boolean boolean0 = target0.__target__(object0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      boolean boolean0 = target0.__target__(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((Object) null, (Object) null);
      assertFalse(boolean0);
  }
}