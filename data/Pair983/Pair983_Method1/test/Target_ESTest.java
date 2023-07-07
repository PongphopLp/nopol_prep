/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 12:40:52 GMT 2022
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
      char[] charArray0 = new char[3];
      charArray0[1] = '';
      String string0 = target0.__target__(charArray0, 0, 1446);
      assertEquals("..", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[8];
      charArray0[6] = ' ';
      String string0 = target0.__target__(charArray0, 0, 1391);
      assertEquals("...... .", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[3];
      String string0 = target0.__target__(charArray0, 1, 0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((char[]) null, 127, 127);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        target0.__target__(charArray0, (-195), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -195 out of bounds for length 8
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[3];
      charArray0[2] = '\u008F';
      String string0 = target0.__target__(charArray0, 0, '\u008F');
      assertEquals("...", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[2];
      String string0 = target0.__target__(charArray0, '\u0000', '\u0000');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[0];
      String string0 = target0.__target__(charArray0, 1, 1);
      assertEquals("", string0);
  }
}
