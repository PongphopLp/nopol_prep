/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 05:15:21 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Map<String, String> map0 = target0.__target__("@O<qs%XOX5n%[2 k@G");
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Map<String, String> map0 = target0.__target__("|knL8A3=Zg!3");
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Map<String, String> map0 = target0.__target__("&");
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Map<String, String> map0 = target0.__target__("");
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Map<String, String> map0 = target0.__target__("$C=R>*Ku q~lt_9=e");
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Map<String, String> map0 = target0.__target__((String) null);
      assertTrue(map0.isEmpty());
  }
}
