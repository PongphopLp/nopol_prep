/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 05:07:43 GMT 2022
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
      stringArray0[0] = "}V";
      stringArray0[1] = "";
      stringArray0[2] = "Target";
      stringArray0[3] = "";
      stringArray0[4] = "]fHX[bW+";
      stringArray0[5] = "E=@N)^5@,AN_v(1;";
      stringArray0[6] = "v!J |";
      boolean boolean0 = target0.__target__(stringArray0, "v!J |");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "}V";
      stringArray0[1] = "";
      stringArray0[2] = "Target";
      stringArray0[3] = "";
      stringArray0[4] = "]fHX[bW+";
      stringArray0[5] = "E=@N)^5@,AN_v(1;";
      stringArray0[6] = "v!J |";
      stringArray0[7] = "";
      boolean boolean0 = target0.__target__(stringArray0, ")");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[8];
      boolean boolean0 = target0.__target__(stringArray0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((String[]) null, "C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
