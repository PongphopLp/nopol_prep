/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 12:34:14 GMT 2022
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
      double double0 = target0.__target__(1208.5, 0.0, 1208.5);
      assertEquals(1208.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(1208.5, 0.0, 608.2698);
      assertEquals(608.2698, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0.0, 821.13382102, 821.13382102);
      assertEquals(821.13382102, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__((-3722.055911368486), 821.13382102, (-3722.055911368486));
      assertEquals((-3722.055911368486), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0.0, (-2135.0), 2066.8305151982563);
      assertEquals(0.0, double0, 0.01);
  }
}
