/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 26 02:18:06 GMT 2022
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
      Double double0 = new Double(0.0);
      Double double1 = target0.__target__(double0);
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = new Double((-106.74));
      Double double1 = target0.__target__(double0);
      assertEquals((-106.74), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = new Double(1.0);
      Double double1 = target0.__target__(double0);
      assertEquals(1.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Object object0 = new Object();
      Double double0 = target0.__target__(object0);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Double double0 = target0.__target__((Object) null);
      assertNull(double0);
  }
}
