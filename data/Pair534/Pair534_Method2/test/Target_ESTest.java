/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 11:57:16 GMT 2022
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
      List<String> list0 = List.of("lwo'", "lwo'");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = target0.__target__(linkedList0, list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        target0.__target__(linkedList0, (List<String>) null);
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
      List<String> list0 = List.of("", "");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.addLast(",aUO");
      linkedList0.add("");
      boolean boolean0 = target0.__target__(linkedList0, list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      List<String> list0 = List.of("", "");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = target0.__target__(list0, linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      List<String> list0 = List.of("", "");
      boolean boolean0 = target0.__target__(list0, list0);
      assertTrue(boolean0);
  }
}
