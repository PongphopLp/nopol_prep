/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 06:38:03 GMT 2022
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
      Double double0 = new Double(0.0);
      Double double1 = new Double((-1031.633));
      int int0 = target0.__target__(double0, double1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = new Double(0.0);
      Double double1 = new Double((-569.0282997512));
      int int0 = target0.__target__(double1, double0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = new Double(0.0);
      int int0 = target0.__target__(double0, (Double) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = new Double(2335.441686378864);
      int int0 = target0.__target__((Double) null, double0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__((Double) null, (Double) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = new Double((-1.0));
      int int0 = target0.__target__(double0, double0);
      assertEquals(0, int0);
  }
}
