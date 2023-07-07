/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 19:43:17 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        target0.__target__(linkedList0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.addFirst("");
      boolean boolean0 = target0.__target__(linkedList0, "8bf");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.addFirst("");
      boolean boolean0 = target0.__target__(linkedList0, "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = target0.__target__(linkedList0, "Vw\u0000]M");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((List<String>) null, "z,");
      assertFalse(boolean0);
  }
}
