/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 10:20:38 GMT 2022
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
      String string0 = target0.__target__("Target", "Target", "Target", 221);
      assertEquals("Target", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("Target", "Target", "Target", 1);
      assertEquals("Target", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("Target", "w;hWb/XQQ(Nq:rhQs5Q", "7>>1u{tR$rHAz", 0);
      assertEquals("Target", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("</@A>&V", "", "Target", 0);
      assertEquals("</@A>&V", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("</@A>&V", " ,SErc(Svd[XO3_", (String) null, 3258);
      assertEquals("</@A>&V", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("", (String) null, "Target", 1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("=J", "=J", "=J", (-557));
      assertEquals("=J", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((String) null, "HU [i;@W}?'JuKo", "UW>d;46L+;|ma", (-1));
      assertNull(string0);
  }
}
