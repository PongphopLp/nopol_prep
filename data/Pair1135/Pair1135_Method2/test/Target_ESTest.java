/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 04:21:59 GMT 2022
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
      Target target0 = new Target();
      CharBuffer charBuffer0 = CharBuffer.allocate(622);
      char[] charArray0 = new char[2];
      charArray0[0] = '9';
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      int int0 = target0.__target__(charBuffer0, charBuffer1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((CharSequence) null, (CharSequence) null);
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
      char[] charArray0 = new char[16];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.put('\u0000');
      // Undeclared exception!
      try { 
        target0.__target__(charBuffer1, charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = charBuffer0.put('H');
      CharBuffer charBuffer2 = CharBuffer.wrap(charArray0);
      int int0 = target0.__target__(charBuffer2, charBuffer1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 1, 1);
      int int0 = target0.__target__(charBuffer0, charBuffer1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      CharBuffer charBuffer0 = CharBuffer.allocate(3893);
      target0.__target__(charBuffer0, charBuffer0);
      target0.__target__(charBuffer0, charBuffer0);
      // Undeclared exception!
      target0.__target__(charBuffer0, charBuffer0);
  }
}
