/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 02:36:52 GMT 2022
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
      char[] charArray0 = new char[4];
      charArray0[0] = '/';
      boolean boolean0 = target0.__target__("*5\"8oG9A3J/pE5,g}", charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[0];
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("F9", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("7cp", (char[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[4];
      boolean boolean0 = target0.__target__("", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[6];
      boolean boolean0 = target0.__target__("Target", charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[3];
      boolean boolean0 = target0.__target__((String) null, charArray0);
      assertFalse(boolean0);
  }
}