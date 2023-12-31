/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 06:16:19 GMT 2022
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
      char[] charArray0 = new char[1];
      charArray0[0] = '4';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate('4');
      int int0 = target0.__target__(charBuffer1, charBuffer0, '4');
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      CharBuffer charBuffer0 = CharBuffer.allocate(3605);
      target0.__target__(charBuffer0, charBuffer0, 3605);
      target0.__target__(charBuffer0, charBuffer0, 3605);
      // Undeclared exception!
      target0.__target__(charBuffer0, charBuffer0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((CharSequence) null, (CharSequence) null, 0);
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
      CharBuffer charBuffer0 = CharBuffer.allocate(39);
      Target target0 = new Target();
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append((CharSequence) charBuffer1);
      // Undeclared exception!
      try { 
        target0.__target__(charBuffer1, charBuffer1, 0);
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
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      charArray0[0] = '4';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate(13);
      int int0 = target0.__target__(charBuffer1, charBuffer0, 13);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      charArray0[0] = '4';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.allocate(1);
      int int0 = target0.__target__(charBuffer0, charBuffer1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 0, 0);
      int int0 = target0.__target__(charBuffer0, charBuffer1, 455);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      char[] charArray0 = new char[14];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = target0.__target__(charBuffer0, charBuffer0, (-20));
      assertEquals((-1), int0);
  }
}
