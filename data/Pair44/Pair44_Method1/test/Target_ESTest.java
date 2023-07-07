/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 14:36:29 GMT 2022
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
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = target0.__target__(doubleArray0, 1);
      assertEquals(4, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = target0.__target__(doubleArray0, 0);
      assertEquals(4, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = target0.__target__(doubleArray0, 0);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = target0.__target__(doubleArray0, 829);
      assertEquals(5, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = target0.__target__(doubleArray0, (-2863));
      assertSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = target0.__target__((double[]) null, 0);
      assertNull(doubleArray0);
  }
}
