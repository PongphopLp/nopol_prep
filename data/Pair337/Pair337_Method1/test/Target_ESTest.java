/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:15:41 GMT 2022
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
      float[] floatArray0 = new float[2];
      floatArray0[0] = (-156.0F);
      float[] floatArray1 = new float[2];
      boolean boolean0 = target0.__target__(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[4];
      float[] floatArray1 = new float[1];
      boolean boolean0 = target0.__target__(floatArray1, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[4];
      boolean boolean0 = target0.__target__(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      float[] floatArray0 = new float[1];
      Target target0 = new Target();
      float[] floatArray1 = new float[1];
      floatArray1[0] = 269.31F;
      boolean boolean0 = target0.__target__(floatArray1, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[4];
      float[] floatArray1 = new float[1];
      boolean boolean0 = target0.__target__(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      float[] floatArray0 = new float[2];
      float[] floatArray1 = new float[2];
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(floatArray0, floatArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[4];
      boolean boolean0 = target0.__target__(floatArray0, floatArray0);
      assertTrue(boolean0);
  }
}