/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 05:22:30 GMT 2022
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
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        target0.__target__((Class) null, class0);
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
      Class<Character> class0 = Character.TYPE;
      Class<Object> class1 = Object.class;
      boolean boolean0 = target0.__target__(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Class<Character> class0 = Character.class;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = target0.__target__(class1, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Class<Character> class0 = Character.class;
      Class<Object> class1 = Object.class;
      boolean boolean0 = target0.__target__(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Class<Object> class0 = Object.class;
      boolean boolean0 = target0.__target__(class0, class0);
      assertTrue(boolean0);
  }
}
