/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 02:31:27 GMT 2022
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
      Long long0 = new Long(0L);
      Long long1 = target0.__target__(long0, long0);
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(0L);
      Long long1 = new Long((-2860L));
      Long long2 = target0.__target__(long1, long0);
      assertEquals((-2860L), (long)long2);
      assertNotNull(long2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(693L);
      Long long1 = target0.__target__(long0, (Long) null);
      assertNull(long1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long(1L);
      Long long1 = target0.__target__(long0, long0);
      assertEquals(2L, (long)long1);
      assertNotNull(long1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = target0.__target__((Long) null, (Long) null);
      assertNull(long0);
  }
}
