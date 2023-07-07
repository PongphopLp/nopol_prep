/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 07:02:02 GMT 2022
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
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[3][9];
      int[] intArray2 = new int[5];
      intArray2[0] = (-3193);
      intArray1[0] = intArray2;
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 657, 1, (-3193), 657, 4208, intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 3
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      intArray0[1] = 1;
      int[][] intArray1 = new int[2][8];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 2401, (-2144843840), 0, (-2145084224), (-1), intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 8
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[][] intArray1 = new int[2][8];
      Target target0 = new Target();
      double[] doubleArray0 = target0.__target__(intArray0, 0, 0, 0, 0, 0, intArray1);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 1760, 1760, 1760, 1760, 1760, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[0];
      int[][] intArray1 = new int[11][4];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, (-37), (-37), (-37), (-37), (-37), intArray1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -36
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[3][2];
      double[] doubleArray0 = target0.__target__(intArray0, 2, 2146532634, 2, 1, 2146532634, intArray1);
      assertArrayEquals(new double[] {0.9000000158945719, 0.9000000158945719, 2.1465326322E9}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[2][1];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 2, 1, 1, 1, 1, intArray1);
      assertArrayEquals(new double[] {0.5, 0.0, 0.5}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[9][2];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 2, 2145686590, 1, (-2776), (-1420), intArray1);
      assertArrayEquals(new double[] {2776.1, 4842.1, 6198.200000000001}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[12];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      int[][] intArray1 = new int[5][2];
      intArray1[0] = intArray0;
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 2042, 1, 0, 1, 1, intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 5
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[5][2];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 2, (-3915), 2, 1, 2, intArray1);
      assertArrayEquals(new double[] {0.9, 0.19999999999999996, 0.8999999999999999}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[5][2];
      double[] doubleArray0 = target0.__target__(intArray0, 2, (-3915), 2, 1, 2, intArray1);
      assertArrayEquals(new double[] {0.6666666666666666, 0.6666666666666666, 0.6666666666666667}, doubleArray0, 0.01);
  }
}
