/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 04:29:08 GMT 2022
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
      boolean boolean0 = target0.__target__(0.0, 0.0, (-826.919), 0.0, (-1.0), (-182.6702356405), (-1.0), 0.0, false, false, false, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-1053.074906), (-1053.074906), (-1053.074906), (-1053.074906), (-1053.074906), (-1053.074906), (-1053.074906), 1159.4014546599612, false, false, false, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-575.003947474), 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, false, false, true, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-1.0), (-1.0), 0.0, 557.8, (-1062.309), (-1.0), 1136.393, 0.0, true, true, true, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(1339.115549338623, 2854.56, (-1.0), (-1.0), 0.0, 1423.95207172916, 0.0, 1423.95207172916, false, true, false, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, 1797.277886114217, false, false, false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((-1.0), (-1.0), (-1.0), (-1.0), (-1.0), 0.0, 0.0, 0.0, true, true, true, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(1251.17, 0.0, 0.0, 0.0, 2116.25035, 0.0, 0.0, 0.0, true, true, false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(0.0, 0.0, 0.0, 0.0, (-1964.02), 1244.25370889049, 0.0, 0.0, false, false, false, false);
      assertTrue(boolean0);
  }
}
