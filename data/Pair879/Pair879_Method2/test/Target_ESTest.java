/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 02:16:13 GMT 2022
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
      Byte byte0 = new Byte((byte)0);
      Byte byte1 = new Byte((byte)112);
      int int0 = target0.__target__(byte1, byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Byte byte0 = new Byte((byte)0);
      Byte byte1 = new Byte((byte)112);
      int int0 = target0.__target__(byte0, byte1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Byte byte0 = new Byte((byte)0);
      int int0 = target0.__target__(byte0, (Byte) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Byte byte0 = new Byte((byte)106);
      int int0 = target0.__target__((Byte) null, byte0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Byte byte0 = new Byte((byte)0);
      int int0 = target0.__target__(byte0, byte0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Byte byte0 = new Byte((byte)0);
      Byte byte1 = new Byte((byte)0);
      int int0 = target0.__target__(byte0, byte1);
      assertEquals(0, int0);
  }
}