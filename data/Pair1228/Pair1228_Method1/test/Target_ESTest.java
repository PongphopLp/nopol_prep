/*
 * This file was automatically generated by EvoSuite
 * Sun May 01 22:03:11 GMT 2022
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
      String string0 = target0.__target__("oxWs\"R&apos;.= 5{OcCc6", true);
      assertEquals("oxWs&quot;R&amp;apos;.= 5{OcCc6", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("#Q/>G", true);
      assertEquals("#Q/&gt;G", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("lB|u+!s'K{pA07|W\"M-", false);
      assertEquals("lB|u+!s&apos;K{pA07|W\"M-", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((String) null, false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("_<}*2$", true);
      assertEquals("_&lt;}*2$", string0);
  }
}
