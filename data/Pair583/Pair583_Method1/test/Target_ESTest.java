/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 14:01:01 GMT 2022
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
      byte byte0 = target0.__target__((byte) (-128));
      assertEquals((byte) (-128), byte0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      byte byte0 = target0.__target__(127L);
      assertEquals((byte)127, byte0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      byte byte0 = target0.__target__(0L);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      byte byte0 = target0.__target__(375L);
      assertEquals((byte)127, byte0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      byte byte0 = target0.__target__((-2665L));
      assertEquals((byte) (-128), byte0);
  }
}
