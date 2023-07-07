/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 12:29:56 GMT 2022
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "5\"";
      stringArray0[1] = "";
      stringArray0[2] = "EndPart";
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, "G(/jE?|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Redirect.Target=&zp%~Obt}j/L<G:Jz";
      stringArray0[1] = "Name=&zp%~Obt}j/L<G:Jz";
      stringArray0[2] = "EndPart";
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, "Name=&zp%~Obt}j/L<G:Jz");
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Xh}|+mn#-iyw@b=s";
      stringArray0[1] = "";
      stringArray0[2] = "^'UFS";
      stringArray0[3] = "6AmX1a)Qhw{HYnwK";
      stringArray0[4] = "gqA9CRRtG[#}{_<";
      stringArray0[5] = "Document";
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, "`XR9wy/z8");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "Redirect.Target=";
      stringArray0[2] = "~vyYD^_mrhw$\"#Q";
      stringArray0[3] = "End";
      stringArray0[4] = "<d+onVM:`OYUc=b+oE2";
      stringArray0[5] = "";
      stringArray0[6] = "b63Wj0NKuqkw/hRx";
      stringArray0[7] = "Redirect.Target=";
      String string0 = target0.__target__(stringArray0, "ch@/!");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((String[]) null, "h@/");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[8];
      String string0 = target0.__target__(stringArray0, "<d+onVM:`OYUc=b+oE2");
      assertNull(string0);
  }
}