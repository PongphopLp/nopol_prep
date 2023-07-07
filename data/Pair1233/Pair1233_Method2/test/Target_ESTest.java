/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 06:11:33 GMT 2022
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
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("<Y^sj,]4)SF", 32);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("~ XBU|>(6", 0);
      assertEquals("~", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("* o", 0);
      assertEquals("* o", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("}~O[?W%v", 1);
      assertEquals("~O", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("%Lc7^=+4(!", 0);
      assertEquals("%Lc7^=+4", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__(" l?)>-:I5>1", 0);
      assertEquals("l?", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("Qn=n/vPu}z^$=H%", 0);
      assertEquals("Qn=n", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__(".@f+xQN;Ez(;u{*Z-H", 1);
      assertEquals("@f+xQN", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__(")CjHkk-", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__(";f3^~@#F!2)M@>yz+", 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("f/`", 1);
      assertEquals("`", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("(_cZ<`hcbgiq8WZ3-", (-1890));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("#Z 3~*?jkT0TW_`Q#", 0);
      assertEquals("#Z 3~*?jkT0TW_`Q#", string0);
  }
}