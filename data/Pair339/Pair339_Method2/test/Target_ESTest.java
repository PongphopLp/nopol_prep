/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 11:55:17 GMT 2022
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
      float float0 = target0.__target__(0.6666667F, 692.1425F, 0.61467206F);
      assertEquals(216.38483F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, 0.0F, 0.6666667F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(7.00363F, 0.0F, 1.0F);
      assertEquals(7.00363F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, 0.6666667F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, 1554.4F, 1554.4F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(3.0F, (-23.684832F), 1.3333334F);
      assertEquals((-23.684832F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(692.1425F, 3.0F, (-2435.6685F));
      assertEquals(1.0067693E7F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-882.0F), (-1752.031F), 1.5F);
      assertEquals((-1752.0311F), float0, 0.01F);
  }
}
