/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 19:16:06 GMT 2022
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
      boolean boolean0 = target0.__target__(1, 0, 1, 1, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(1, 1, 0, 0, 1, 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-1), (-3268), 894, (-647), 1, (-3268));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(0, 0, 1196, (-1), 0, (-2821));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-735), 1, 1, (-983), (-1), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(0, 1103, 1103, 1103, 0, 1103);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(1103, (-2487), 1103, 1, (-1), (-2487));
      assertFalse(boolean0);
  }
}
