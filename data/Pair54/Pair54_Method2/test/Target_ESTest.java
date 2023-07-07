/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 15:12:30 GMT 2022
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
      float[] floatArray0 = new float[7];
      boolean boolean0 = target0.__target__(0.0F, 0.0F, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[3];
      floatArray0[1] = (-16.66F);
      boolean boolean0 = target0.__target__((-16.66F), (-16.66F), floatArray0);
      assertTrue(boolean0);
      assertArrayEquals(new float[] {0.0F, (-16.66F), 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[3];
      boolean boolean0 = target0.__target__(1.0F, 0.0F, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[3];
      floatArray0[1] = (-16.66F);
      boolean boolean0 = target0.__target__(841.24F, 1.0F, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__(2897.2058F, 2897.2058F, (float[]) null);
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
      float[] floatArray0 = new float[1];
      // Undeclared exception!
      try { 
        target0.__target__((-2392.11F), (-2392.11F), floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[7];
      boolean boolean0 = target0.__target__(0.0F, (-2731.07F), floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[7];
      floatArray0[0] = (-2731.07F);
      boolean boolean0 = target0.__target__((-2731.07F), 546.0F, floatArray0);
      assertArrayEquals(new float[] {(-2731.07F), (-0.19992164F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[3];
      boolean boolean0 = target0.__target__((-697.0793F), 278.15253F, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[7];
      boolean boolean0 = target0.__target__((-2731.07F), 0.0F, floatArray0);
      assertTrue(boolean0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[7];
      floatArray0[0] = (-2731.07F);
      boolean boolean0 = target0.__target__(1190.14F, (-2731.07F), floatArray0);
      assertTrue(boolean0);
      assertArrayEquals(new float[] {(-2.2947469F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[7];
      boolean boolean0 = target0.__target__(1190.14F, (-2731.07F), floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[1];
      boolean boolean0 = target0.__target__(0.0F, 2465.6F, floatArray0);
      assertFalse(boolean0);
  }
}