/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 22:42:17 GMT 2022
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
      boolean boolean0 = target0.__target__(0.0, 3370.43469, 1.0, 3370.43469, 1.0, 1.0, true, false, (-3559.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-1.0), 0.0, (-1.0), 770.0169250109561, (-1.0), 0.0, false, false, 3370.43469);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-5322.0027363), (-5322.0027363), 2408.192105287, 0.0, 0.0, (-5322.0027363), true, true, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(0.0, 0.0, 0.0, (-329.147674), 0.0, 0.0, false, false, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(5.558951824001742, 5.558951824001742, 5.558951824001742, (-329.147674), 5.558951824001742, 5.558951824001742, true, true, 5.558951824001742);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-1.0), (-1.0), 1.0, 1.0, 1.0, 1.0, false, false, (-1.0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-6.056816664197543), (-329.1), (-6.056816664197543), (-6.056816664197543), (-6.056816664197543), 1582.8, true, true, (-6.056816664197543));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(1.0, 327.676566639863, 1.0, (-365.547), 189.3248245, (-3578.88), false, true, 770.0169250109561);
      assertFalse(boolean0);
  }
}