/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 14:29:48 GMT 2022
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
      float float0 = target0.__target__((-2671.76F), 0.0F, 0.0F, (-1.0F));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.5F, 0.0F, 0.0F, 1.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(2.0F, 248.3F, (-1926.363F), (-1.0F));
      assertEquals(248.3F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(248.3F, (-1925.363F), (-1.0F), 0.0F);
      assertEquals((-1926.363F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-1.0F), (-2671.76F), 248.3F, (-1.0F));
      assertEquals((-2423.46F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, 0.0F, 0.0F, (-579.501F));
      assertEquals(0.0F, float0, 0.01F);
  }
}
