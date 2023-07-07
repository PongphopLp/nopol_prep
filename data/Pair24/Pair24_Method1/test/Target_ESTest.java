/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 12:38:41 GMT 2022
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
      double double0 = target0.__target__(0.0, (-1.0), 7.5);
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(667.9114, (-23.096), 3.5);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(2.2, 2.2, 2.2);
      assertEquals(2.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(433.80720728497624, (-1629.447405674633), 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0.0, 2.2, 1000.0);
      assertEquals(1000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__((-1088.0923), 0.0, (-1088.0923));
      assertEquals(1000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0.3082436885424097, 0.3082436885424097, 0.3082436885424097);
      assertEquals(0.24999999999999997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(1276.8761, 0.0, 1.8);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      double double0 = target0.__target__(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}