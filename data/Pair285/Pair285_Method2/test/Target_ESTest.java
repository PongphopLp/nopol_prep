/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 08:57:39 GMT 2022
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
      Long long0 = new Long(146L);
      String string0 = target0.__target__(long0);
      assertEquals("146", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(1000L);
      String string0 = target0.__target__(long0);
      assertEquals("1s", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(2002L);
      String string0 = target0.__target__(long0);
      assertEquals("2s", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(0L);
      String string0 = target0.__target__(long0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long((-959L));
      String string0 = target0.__target__(long0);
      assertEquals("-959", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((Long) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(1865365460);
      String string0 = target0.__target__(long0);
      assertNotNull(string0);
      assertEquals("21.59d", string0);
  }
}
