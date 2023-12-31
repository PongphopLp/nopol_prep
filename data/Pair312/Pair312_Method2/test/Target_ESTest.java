/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 04:55:01 GMT 2022
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
      boolean boolean0 = target0.__target__("G>6hAE5jq)>Yhj9", "Bsq7e162f&`b@$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__(" [QaQ2ljJeLfWwE!*pD", " [QaQ2ljJeLfWwE!*pD");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 18 out of bounds for length 18
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(":8-'.!#!&9lIllK/", "Au+jX^v#Gk$F-!09");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("_QtqQ*1T(#h9Xh", "3D95q'))R3$B6t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("18;0O#[|'^q", "18;0O#[|'^q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("G>6hAE5jq)>Yhj9", "G>6hAE5jq)>Yhj9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("[ k6/.?x-#9w", "Au+jX^v#Gk$F-!09");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("18;0O#[|'^q", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("&8$B;wQHi%_2~L", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("", "<U");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((String) null, "");
      assertTrue(boolean0);
  }
}
