/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 09:31:24 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[3] = '5';
      charArray0[4] = ' ';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Target target0 = new Target();
      int int0 = target0.__target__(charBuffer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[4] = ' ';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Target target0 = new Target();
      int int0 = target0.__target__(charBuffer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Target target0 = new Target();
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.flip();
      // Undeclared exception!
      try { 
        target0.__target__(charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Target target0 = new Target();
      int int0 = target0.__target__(charBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[1];
      charArray0[0] = ' ';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = target0.__target__(charBuffer0);
      assertEquals(0, int0);
  }
}
