/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 19:46:57 GMT 2022
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
      String string0 = target0.__target__((byte) (-66));
      assertEquals("BE", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte) (-3));
      assertEquals("FD", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte) (-52));
      assertNotNull(string0);
      assertEquals("CC", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte) (-85));
      assertEquals("AB", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte) (-124));
      assertEquals("84", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte)115);
      assertNotNull(string0);
      assertEquals("73", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte)54);
      assertEquals("36", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte)37);
      assertNotNull(string0);
      assertEquals("25", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte) (-95));
      assertNotNull(string0);
      assertEquals("A1", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte)4);
      assertEquals("04", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((byte) (-103));
      assertNotNull(string0);
      assertEquals("99", string0);
  }
}