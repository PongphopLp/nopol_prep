/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 22:20:12 GMT 2022
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
  public void test00()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      String string0 = target0.__target__("' ", intArray0);
      assertEquals("' ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      String string0 = target0.__target__("\"\rukZj'%[8T4j&P$", intArray0);
      assertEquals("'\"\r", string0);
      
      String string1 = target0.__target__("kzR$r6eGd\"Dmxy/:|;n", intArray0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertEquals("z", string1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[3];
      String string0 = target0.__target__("=$k<&#k3-=qrHhZVr>b", intArray0);
      assertEquals("'=$", string0);
      
      String string1 = target0.__target__("Target", intArray0);
      assertArrayEquals(new int[] {1, 0, 0}, intArray0);
      assertEquals("a", string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[5];
      String string0 = target0.__target__("Z}GpU!", intArray0);
      assertEquals("Z", string0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      String string0 = target0.__target__("A`T", intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      target0.__target__("\"\rukZj'%[8T4j&P$", intArray0);
      // Undeclared exception!
      try { 
        target0.__target__("e", intArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        target0.__target__((String) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        target0.__target__("", intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      Target target0 = new Target();
      String string0 = target0.__target__("+'']?", intArray0);
      assertEquals("'+']?", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[4];
      String string0 = target0.__target__("'Swj'", intArray0);
      assertArrayEquals(new int[] {5, 0, 0, 0}, intArray0);
      assertEquals("'Swj", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[4];
      String string0 = target0.__target__("P", intArray0);
      assertEquals("P", string0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      Target target0 = new Target();
      String string0 = target0.__target__("-cK1g 1jy>qh? _", intArray0);
      assertEquals("'-", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      Target target0 = new Target();
      String string0 = target0.__target__("NN(7", intArray0);
      assertEquals("NN", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Target target0 = new Target();
      int[] intArray0 = new int[1];
      String string0 = target0.__target__("0LnDW;=U", intArray0);
      assertEquals("'0", string0);
  }
}
