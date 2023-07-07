/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 11:51:00 GMT 2022
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
      float float0 = target0.__target__(255.40312F, 223.5742F, 240.0F);
      assertEquals(255.40312F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(45.132866F, (-5247.9497F), 60.0F);
      assertEquals((-5247.9497F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-650.473F), (-3076.0466F), 0.0F);
      assertEquals((-650.473F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-5247.9497F), 0.0F, 360.0F);
      assertEquals((-5247.9497F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, 1743.3774F, 2455.68F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, 1190.0F, (-287.74F));
      assertEquals(1190.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(465.58F, 180.0F, (-2880.8364F));
      assertEquals(12463.921F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(1190.0F, 180.0F, 180.0F);
      assertEquals(180.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-140.481F), (-140.481F), (-140.481F));
      assertEquals((-140.481F), float0, 0.01F);
  }
}
