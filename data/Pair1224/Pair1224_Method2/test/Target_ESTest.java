/*
 * This file was automatically generated by EvoSuite
 * Sun May 01 21:13:33 GMT 2022
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
      long long0 = target0.__target__((-2009L), 0L);
      assertEquals((-2009L), long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__((-1050L), 906L);
      assertEquals((-144L), long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__((-1174L), (-5678L));
      assertEquals((-6852L), long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(2479L, (-1L));
      assertEquals(2478L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__((-2663L), (-9223372036854775808L));
      assertEquals((-9223372036854775808L), long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(0L, 2228L);
      assertEquals(2228L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(9223372036854775807L, 4456L);
      assertEquals(9223372036854775807L, long0);
  }
}
