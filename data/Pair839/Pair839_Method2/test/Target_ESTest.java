/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 22:28:31 GMT 2022
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
      Boolean boolean0 = target0.__target__("7");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(1);
      Boolean boolean0 = target0.__target__(integer0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("O7o2oZh{%1 j%");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("yjUf?34qpHF+@-Tc");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("fxv.l*`");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("tgj.mdz}k)*");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Boolean boolean0 = target0.__target__(object0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(0);
      Boolean boolean0 = target0.__target__(integer0);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__(integer0);
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("ngj.mdz}k)rc^*");
      Boolean boolean1 = target0.__target__(boolean0);
      assertFalse(boolean1);
      assertNotNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__((Object) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      Boolean boolean0 = target0.__target__("-25");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }
}
