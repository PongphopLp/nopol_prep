/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 18:21:52 GMT 2022
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
      Integer integer0 = new Integer(0);
      Integer integer1 = target0.__target__(integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer((-891));
      Integer integer1 = target0.__target__(integer0);
      assertEquals((-891), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer(933);
      Integer integer1 = target0.__target__(integer0);
      assertTrue(integer1.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = target0.__target__((Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = target0.__target__(target0);
      assertNull(integer0);
  }
}
