/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 07:02:00 GMT 2022
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
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[1][7];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 2, (-1), (-1), 1, 0, intArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[14];
      intArray0[0] = 1;
      intArray0[1] = 1;
      Target target0 = new Target();
      int[][] intArray1 = new int[8][6];
      int[] intArray2 = new int[7];
      intArray2[0] = (-1258);
      intArray1[0] = intArray2;
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 2580, 1, 1, 4245, (-1258), intArray1);
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
      Target target0 = new Target();
      int[] intArray0 = new int[2];
      intArray0[1] = 1;
      int[][] intArray1 = new int[2][6];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 2610, (-554), 0, (-1779), (-1779), intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1 out of bounds for length 6
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      double[] doubleArray0 = target0.__target__(intArray0, 0, 0, (-921), (-921), (-921), (int[][]) null);
      assertArrayEquals(new double[] {921.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        target0.__target__(intArray0, 30, 30, 30, 30, 30, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int[][] intArray0 = new int[2][1];
      int[] intArray1 = new int[1];
      // Undeclared exception!
      try { 
        target0.__target__(intArray1, (-383), (-383), (-383), (-383), (-383), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -382
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[12];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      int[][] intArray1 = new int[2][9];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 4, 1, 1, 1, 1692, intArray1);
      assertArrayEquals(new double[] {0.8999999999999773, 280.7, 280.7, 280.7, 2533.2}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[12];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      int[][] intArray1 = new int[2][1];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 4, 1692, 1692, 4, 1, intArray1);
      assertArrayEquals(new double[] {0.5, 0.0, 0.0, 0.0, 0.5}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[12];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      int[][] intArray1 = new int[2][9];
      double[] doubleArray0 = target0.__target__(intArray0, 4, 1692, 1692, 4, 1, intArray1);
      assertArrayEquals(new double[] {0.2, 0.2, 0.2, 0.2, 0.19999999999999996}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      intArray0[1] = 1;
      int[][] intArray1 = new int[2][9];
      intArray1[0] = intArray0;
      double[] doubleArray0 = target0.__target__(intArray0, 2, 2, 1, 1, 2, intArray1);
      assertArrayEquals(new double[] {0.9, 0.19999999999999996, 0.8999999999999999}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[12];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      int[][] intArray1 = new int[2][9];
      double[] doubleArray0 = target0.__target__(intArray0, 4, 1, 1, 1, 1692, intArray1);
      assertArrayEquals(new double[] {0.9, 0.9, 0.9, 0.9, 1688.4}, doubleArray0, 0.01);
  }
}