/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 22:31:23 GMT 2022
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
      Integer integer0 = Integer.getInteger("uIzy*", 1667);
      int int0 = target0.__target__("uIzy*", "~'|A!,hvKqOUS-y", integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("kRs6sh@XKX^B3", "kRs6sh@XKX^B3", (Integer) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = new Integer((-1));
      int int0 = target0.__target__("", "", integer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__((String) null, "'+0\"t;eF>(D@l", (Integer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__((String) null, (String) null, (Integer) null);
      assertEquals(0, int0);
  }
}
