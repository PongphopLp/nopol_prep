/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 13:42:29 GMT 2022
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
      float[] floatArray0 = new float[9];
      floatArray0[0] = (-4131.156F);
      float float0 = target0.__target__(floatArray0, floatArray0);
      assertEquals(1.7066448E7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[9];
      floatArray0[3] = 2932.8723F;
      float[] floatArray1 = new float[8];
      floatArray1[3] = (-4131.156F);
      float float0 = target0.__target__(floatArray1, floatArray0);
      assertEquals((-1.2116152E7F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[1];
      // Undeclared exception!
      try { 
        target0.__target__((float[]) null, floatArray0);
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
      float[] floatArray0 = new float[12];
      float[] floatArray1 = new float[0];
      // Undeclared exception!
      try { 
        target0.__target__(floatArray0, floatArray1);
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
      float[] floatArray0 = new float[18];
      float float0 = target0.__target__(floatArray0, floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
