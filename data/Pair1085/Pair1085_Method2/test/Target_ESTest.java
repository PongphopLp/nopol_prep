/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 17:57:11 GMT 2022
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
      CharSequence[] charSequenceArray0 = new CharSequence[0];
      CharBuffer charBuffer0 = CharBuffer.allocate(5321);
      Target target0 = new Target();
      target0.__target__(charBuffer0, charSequenceArray0);
      // Undeclared exception!
      target0.__target__(charBuffer0, charSequenceArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      CharBuffer charBuffer0 = CharBuffer.allocate(686);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 1, 686);
      CharSequence[] charSequenceArray0 = new CharSequence[7];
      charSequenceArray0[0] = (CharSequence) charBuffer0;
      charSequenceArray0[4] = (CharSequence) charBuffer1;
      charBuffer0.put('`');
      // Undeclared exception!
      try { 
        target0.__target__(charSequenceArray0[4], charSequenceArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[2];
      charArray0[0] = '}';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate(1);
      CharSequence[] charSequenceArray0 = new CharSequence[7];
      charSequenceArray0[0] = (CharSequence) charBuffer1;
      // Undeclared exception!
      try { 
        target0.__target__(charBuffer0, charSequenceArray0);
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
      Target target0 = new Target();
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequence[] charSequenceArray0 = new CharSequence[1];
      charSequenceArray0[0] = (CharSequence) charBuffer0;
      boolean boolean0 = target0.__target__(charBuffer0, charSequenceArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharSequence[] charSequenceArray0 = new CharSequence[1];
      charSequenceArray0[0] = (CharSequence) charBuffer0;
      CharBuffer charBuffer1 = CharBuffer.allocate(1);
      boolean boolean0 = target0.__target__(charBuffer1, charSequenceArray0);
      assertFalse(boolean0);
  }
}