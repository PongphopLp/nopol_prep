/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 14:10:11 GMT 2022
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
      double double0 = target0.__target__(1, 4);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__((-2748.45087112637), 2);
      assertEquals(7553982.190995303, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(Double.POSITIVE_INFINITY, 4);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__((-980.6634), 3);
      assertEquals((-9.431046822646685E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0.0, 2);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(1.0, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0, (-2470));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(4471.0, 0);
      assertEquals(1.0, double0, 0.01);
  }
}