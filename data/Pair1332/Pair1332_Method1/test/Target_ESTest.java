/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 12:54:42 GMT 2022
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
      int int0 = target0.__target__('9');
      assertEquals(61, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('z');
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('a');
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('Z');
      assertEquals(25, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('=');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('/');
      assertEquals(63, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('+');
      assertEquals(62, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('%');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('~');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('A');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__('0');
      assertEquals(52, int0);
  }
}
