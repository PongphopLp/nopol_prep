/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 21:12:09 GMT 2022
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
      boolean boolean0 = target0.__target__(">4", (-1253.9941F));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(">=1", 2518.2893F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("<0", 0.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("<=1", 1.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1;", (-590.1451F));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("!", (-1799.2F));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("==1", 1.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("==9", 3190.678F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("!=6", 760.638F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("!=6", 6.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("!=", 2013.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(">4", 4.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(">7", 1668.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(">=9", (-2250.6143F));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(">=1", 1.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("<0", (-760.8F));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("<0", 547.8F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("<=1", (-1384.836F));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("<=1", 3319.77F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("1;", 1668.0F);
      assertFalse(boolean0);
  }
}
