/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 21:46:41 GMT 2022
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
      Object object0 = new Object();
      Object object1 = new Object();
      boolean boolean0 = target0.__target__(object0, object1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      boolean boolean0 = target0.__target__(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      boolean boolean0 = target0.__target__((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      boolean boolean0 = target0.__target__(object0, object0);
      assertTrue(boolean0);
  }
}
