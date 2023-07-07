/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 09:25:02 GMT 2022
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
      Long long0 = Long.getLong("", 0L);
      Number number0 = target0.__target__(long0, long0);
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = Integer.valueOf(1);
      Float float0 = Float.valueOf(0.0F);
      Number number0 = target0.__target__(integer0, float0);
      assertEquals(1.0F, number0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = Integer.valueOf(1);
      Number number0 = target0.__target__(integer0, integer0);
      assertEquals(0, number0);
      
      Number number1 = target0.__target__(integer0, number0);
      assertEquals(1, number1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = Long.valueOf(1L);
      Number number0 = target0.__target__(long0, long0);
      assertEquals(0L, number0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = Long.valueOf((-388L));
      // Undeclared exception!
      try { 
        target0.__target__((Number) null, long0);
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
      Float float0 = Float.valueOf(1332.556F);
      Number number0 = target0.__target__(float0, float0);
      assertEquals(0.0F, number0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = Double.valueOf((-2401.5443));
      // Undeclared exception!
      try { 
        target0.__target__((Number) null, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      Long long0 = new Long((-3059L));
      Double double0 = Double.valueOf(0.0);
      Number number0 = target0.__target__(double0, long0);
      assertEquals(3059.0, number0);
  }
}
