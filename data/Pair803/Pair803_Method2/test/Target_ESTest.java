/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 10:51:45 GMT 2022
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
      floatArray0[0] = (-455.85587F);
      float float0 = target0.__target__(floatArray0, floatArray0, 1);
      assertEquals(207804.56F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[1];
      floatArray0[0] = (-455.85587F);
      float[] floatArray1 = new float[8];
      floatArray1[0] = 207804.56F;
      float float0 = target0.__target__(floatArray0, floatArray1, 1);
      assertEquals((-9.4728928E7F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float[] floatArray0 = new float[4];
      // Undeclared exception!
      try { 
        target0.__target__(floatArray0, floatArray0, 2700);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 4 out of bounds for length 4
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((float[]) null, (float[]) null, 3604);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((float[]) null, (float[]) null, (-1));
      assertEquals(0.0F, float0, 0.01F);
  }
}
