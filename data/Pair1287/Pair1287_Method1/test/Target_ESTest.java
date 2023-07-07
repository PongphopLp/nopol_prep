/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 07:04:57 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 8);
      boolean boolean0 = target0.__target__(classArray0, classArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      // Undeclared exception!
      try { 
        target0.__target__(classArray0, classArray0);
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
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      Class<Integer> class0 = Integer.class;
      classArray0[0] = class0;
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class1 = Object.class;
      classArray1[0] = class1;
      boolean boolean0 = target0.__target__(classArray0, classArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 5);
      boolean boolean0 = target0.__target__(classArray0, classArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      boolean boolean0 = target0.__target__(classArray0, classArray0);
      assertTrue(boolean0);
  }
}