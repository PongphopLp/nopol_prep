/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 19:55:29 GMT 2022
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
      long long0 = target0.__target__(1790, (-1.0F), (-2325));
      assertEquals((-4165330L), long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__((-1190L), (-1190L), 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(2635L, 0.0F, 1211);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(1241L, 3475.6182F, 1211);
      assertEquals(5814852L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      long long0 = target0.__target__(0L, 942.8F, (-1));
      assertEquals(0L, long0);
  }
}
