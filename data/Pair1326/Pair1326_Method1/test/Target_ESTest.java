/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 12:18:14 GMT 2022
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
      String[] stringArray0 = new String[2];
      char[] charArray0 = new char[0];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[21];
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, charArray0, 11, 11);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      char[] charArray0 = new char[3];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "P";
      char[] charArray0 = new char[3];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[21];
      String[] stringArray0 = new String[0];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      char[] charArray0 = new char[2];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 647, 2206);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, charArray0, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[4];
      char[] charArray0 = new char[2];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, (-157), (-157));
      assertFalse(boolean0);
  }
}
