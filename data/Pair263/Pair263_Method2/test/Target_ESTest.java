/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 06:10:28 GMT 2022
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "y96,%h>mlKP(WiYJ$";
      int int0 = target0.__target__("y96,%h>mlKP(WiYJ$", stringArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[7];
      stringArray0[2] = "Target";
      int int0 = target0.__target__("Target", stringArray0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("", (String[]) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[14];
      Target target0 = new Target();
      int int0 = target0.__target__(stringArray0[0], stringArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[7];
      int int0 = target0.__target__("Target", stringArray0);
      assertEquals((-1), int0);
  }
}
