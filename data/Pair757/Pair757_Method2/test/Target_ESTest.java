/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 06:14:07 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      target0.__target__(";b", "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Vector vector0 = target0.__target__("sy[Jo'S]1O-d", "sy[Jo'S]1O-d");
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(1, vector0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Vector vector0 = target0.__target__("", "");
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Vector vector0 = target0.__target__("sy[Jo'S]1O-d", "EFHm");
      assertEquals(10, vector0.capacity());
      assertEquals(1, vector0.size());
  }
}
