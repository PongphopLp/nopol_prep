/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 12:18:18 GMT 2022
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
      char[] charArray0 = new char[1];
      Target target0 = new Target();
      boolean boolean0 = target0.__target__((String[]) null, charArray0, 1, 1936);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[7];
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        target0.__target__(stringArray0, charArray0, 6, 6);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      char[] charArray0 = new char[13];
      Target target0 = new Target();
      boolean boolean0 = target0.__target__(stringArray0, charArray0, '\u0000', '\u0000');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      char[] charArray0 = new char[4];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[4];
      String[] stringArray0 = new String[0];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 1, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      char[] charArray0 = new char[4];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, 3846, 3846);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      String[] stringArray0 = new String[1];
      char[] charArray0 = new char[4];
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
      String[] stringArray0 = new String[8];
      char[] charArray0 = new char[8];
      boolean boolean0 = target0.__target__(stringArray0, charArray0, (-583), (-583));
      assertFalse(boolean0);
  }
}
