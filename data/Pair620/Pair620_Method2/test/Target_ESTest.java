/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 17:26:18 GMT 2022
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
      Object[] objectArray0 = new Object[4];
      int int0 = target0.__target__(objectArray0, (-1), (-2774), objectArray0[2]);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[3];
      int int0 = target0.__target__(objectArray0, (-903), (-903), target0);
      assertEquals(902, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) target0;
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, 0, 1, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class Target cannot be cast to class java.lang.Comparable (Target is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @767c00f0; java.lang.Comparable is in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, (-932), 183, target0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 2147483273 out of bounds for length 3
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        target0.__target__(objectArray0, 0, 1, object0);
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
      Object[] objectArray0 = new Object[4];
      Integer integer0 = Integer.getInteger((String) null, (-423));
      int int0 = target0.__target__(objectArray0, 108, (-423), integer0);
      assertEquals((-109), int0);
  }
}
