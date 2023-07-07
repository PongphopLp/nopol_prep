/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 11:47:58 GMT 2022
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
      float float0 = target0.__target__((-1613.9F), 1297.2274F, 2155.67F);
      assertEquals(2155.67F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, (-2417.497F), 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-98.2F), (-98.2F), (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(482.81F, 874.12836F, (-1.0F));
      assertEquals(874.12836F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(3014.545F, 1.0F, (-2908.0F));
      assertEquals(3014.545F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(0.0F, (-1459.1F), 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__((-1.0F), 0.0F, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }
}
