/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 09:22:59 GMT 2022
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
      Byte byte0 = Byte.valueOf((byte) (-52));
      Number number0 = target0.__target__(byte0, byte0);
      assertEquals((-104), number0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((Number) null, (Number) null);
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
      Long long0 = Long.valueOf((-1043L));
      Number number0 = target0.__target__(long0, long0);
      assertEquals((-2086L), number0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Integer integer0 = Integer.valueOf((-688));
      Long long0 = Long.valueOf((long) (-688));
      Number number0 = target0.__target__(integer0, long0);
      assertEquals((-1376L), number0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Float float0 = Float.valueOf(1431.324F);
      Number number0 = target0.__target__(float0, float0);
      assertEquals(2862.648F, number0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = Double.valueOf(1099.4984820239667);
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
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      Float float0 = Float.valueOf((-912.446F));
      // Undeclared exception!
      try { 
        target0.__target__((Number) null, float0);
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
      Double double0 = Double.valueOf(1.0);
      Number number0 = target0.__target__(double0, double0);
      assertEquals(2.0, number0);
  }
}
