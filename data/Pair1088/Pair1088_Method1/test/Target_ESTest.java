/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 16:51:27 GMT 2022
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
      Integer integer0 = target0.__target__("");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = target0.__target__("0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = target0.__target__("1");
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = target0.__target__((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = target0.__target__("-7");
      assertEquals((-7), (int)integer0);
  }
}