/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 04:40:08 GMT 2022
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
      stringArray0[0] = "4p}7I-!|TOW?<HKu%";
      boolean boolean0 = target0.__target__("4p}7I-!|TOW?<HKu%", stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "4p}7I-!|TOW?<HKu%";
      stringArray0[1] = "4p}7I-!|TOW?<HKu%";
      stringArray0[2] = "4p}7I-!|TOW?<HKu%";
      stringArray0[3] = "4p}7I-!|TOW?<HKu%";
      stringArray0[4] = "4p}7I-!|TOW?<HKu%";
      boolean boolean0 = target0.__target__("'*K>*$&Q/47", stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      boolean boolean0 = target0.__target__((String) null, stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        target0.__target__("2*iRo(f\"r\",^(:71ye", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__("-", (String[]) null);
      assertFalse(boolean0);
  }
}