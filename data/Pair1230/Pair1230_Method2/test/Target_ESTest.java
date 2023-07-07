/*
 * This file was automatically generated by EvoSuite
 * Sun May 01 22:24:49 GMT 2022
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
      String string0 = target0.__target__("", false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, true);
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
      String string0 = target0.__target__("6c8SU2g", false);
      assertEquals("6c8SU2g", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("@a ):", true);
      assertEquals("@a\\ )\\:", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__(" [YXv2E", false);
      assertEquals("\\ [YXv2E", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("WW=2]3v,}z", true);
      assertEquals("WW\\=2]3v,}z", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("@a ):", false);
      assertEquals("@a )\\:", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("NP9h{\"#]qAJh3\"k1^Bb", false);
      assertEquals("NP9h{\"\\#]qAJh3\"k1^Bb", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("Xz!j", true);
      assertEquals("Xz\\!j", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("\r", false);
      assertEquals("\\r", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("\f", false);
      assertEquals("\\f", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("\n", true);
      assertEquals("\\n", string0);
  }
}