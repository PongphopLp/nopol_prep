/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 11:15:01 GMT 2022
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
      char char0 = target0.__target__("fE_6o!CO&\",:u");
      assertEquals('\"', char0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__("{_X=/GI8t'yPc_O*L?&");
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__("oK\"3gB8uk~`ZB3XX");
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__(")j{bUC^6XB'7<&I");
      assertEquals('I', char0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__("X&&");
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__("?TZ.UyJ&9tH");
      assertEquals('9', char0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      char char0 = target0.__target__("&&0(]HO");
      assertEquals('\u0000', char0);
  }
}
