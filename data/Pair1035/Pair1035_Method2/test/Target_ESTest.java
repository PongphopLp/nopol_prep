/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 14:35:30 GMT 2022
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
      char[] charArray0 = new char[7];
      charArray0[0] = 'o';
      char[] charArray1 = new char[7];
      boolean boolean0 = target0.__target__(charArray1, charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[3];
      char[] charArray1 = new char[5];
      boolean boolean0 = target0.__target__(charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[6];
      charArray0[0] = '_';
      char[] charArray1 = new char[6];
      boolean boolean0 = target0.__target__(charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[4];
      char[] charArray1 = new char[7];
      boolean boolean0 = target0.__target__(charArray1, charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[1];
      boolean boolean0 = target0.__target__(charArray0, (char[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[1];
      boolean boolean0 = target0.__target__((char[]) null, charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[1];
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(charArray0, charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((char[]) null, (char[]) null);
      assertTrue(boolean0);
  }
}