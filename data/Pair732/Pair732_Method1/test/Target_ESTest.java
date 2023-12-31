/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 02:01:41 GMT 2022
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
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        target0.__target__(doubleArray0, 0.0, (-3562), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1781 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[5];
      int int0 = target0.__target__(doubleArray0, 0.0, (-173), (-238));
      assertEquals(172, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((double[]) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        target0.__target__(doubleArray0, (-6), (-6), (-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -6 out of bounds for length 4
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[5];
      int int0 = target0.__target__(doubleArray0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[7];
      int int0 = target0.__target__(doubleArray0, 6, 6, 6);
      assertEquals((-8), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      double[] doubleArray0 = new double[7];
      int int0 = target0.__target__(doubleArray0, (-13.456519609927359), 0, 0);
      assertEquals((-1), int0);
  }
}
