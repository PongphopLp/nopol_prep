/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 05:33:57 GMT 2022
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
      char char0 = target0.__target__(2, 21);
      assertEquals('2', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(10, 36);
      assertEquals('a', char0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(0, 2);
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(4403, 527);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(0, 4426);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(0, 1);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__((-1), 10);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(18, 36);
      assertEquals('i', char0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(36, 36);
      assertEquals('\u0000', char0);
  }
}