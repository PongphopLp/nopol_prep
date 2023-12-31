/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 13:35:29 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = 3668.728177407437;
      double double0 = target0.__target__(doubleArray0, 3, (-1.0), (-564.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) 3;
      double double0 = target0.__target__(doubleArray0, 3, 1590.413545543558, 3668.728177407437);
      assertEquals(4771.240636630674, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[1];
      double double0 = target0.__target__(doubleArray0, 1431655765, 611.17542589, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        target0.__target__(doubleArray0, (-302), 69.91265891, 69.91265891);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-1255.0);
      double double0 = target0.__target__(doubleArray0, 3, (-2422.07280575108), (-2422.07280575108));
      assertEquals((-0.5181513169005274), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, 1, 1740.41, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        target0.__target__(doubleArray0, (-1), (-1.0), -0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -2 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }
}
