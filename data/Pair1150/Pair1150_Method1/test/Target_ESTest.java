/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 23:02:16 GMT 2022
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
      boolean boolean0 = target0.__target__(')');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('9');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('8');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('7');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('6');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('5');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('4');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('3');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('2');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('1');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('D');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__('0');
      assertTrue(boolean0);
  }
}
