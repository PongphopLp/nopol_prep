/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 22:24:22 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(21);
      Boolean boolean0 = target0.__target__(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("ZvAT");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("0");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("false");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("true");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Boolean boolean0 = target0.__target__(object0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(0);
      Boolean boolean0 = target0.__target__(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer((-1));
      Boolean boolean0 = target0.__target__(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = target0.__target__(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__((Object) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("2");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }
}
