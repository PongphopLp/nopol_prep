/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:34:48 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[5];
      stringArray0[3] = "^}/^L(1(nb}";
      String string0 = target0.__target__(stringArray0, "");
      assertEquals("^}/^L(1(nb}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      String string0 = target0.__target__(stringArray0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "[_bgDw% nE";
      String string0 = target0.__target__(stringArray0, "");
      assertEquals("[_bgDw% nE", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      String string0 = target0.__target__(stringArray0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[0];
      String string0 = target0.__target__(stringArray0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[7];
      String string0 = target0.__target__(stringArray0, "5(Z:-l[d");
      assertEquals("5(Z:-l[d5(Z:-l[d5(Z:-l[d5(Z:-l[d5(Z:-l[d5(Z:-l[d", string0);
  }
}
