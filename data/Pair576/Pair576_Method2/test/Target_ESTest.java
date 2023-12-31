/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 13:42:48 GMT 2022
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
      float[] floatArray0 = new float[1];
      floatArray0[0] = (-950.01F);
      float float0 = target0.__target__(floatArray0, floatArray0);
      assertEquals(902519.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[1];
      floatArray0[0] = (-950.01F);
      float[] floatArray1 = new float[5];
      floatArray1[0] = 902519.0F;
      float float0 = target0.__target__(floatArray0, floatArray1);
      assertEquals((-8.5740211E8F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((float[]) null, (float[]) null);
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
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[5];
      // Undeclared exception!
      try { 
        target0.__target__(floatArray1, floatArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 1 out of bounds for length 1
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[4];
      float float0 = target0.__target__(floatArray0, floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
