/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 20:19:41 GMT 2022
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
      int int0 = target0.__target__("Q@ah}59b)*Og?y", 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("#It<2\"&]wxW2g(M", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("#It<2\"&]wxW2g(M", (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, 2153);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("[jWu{|aYz#$a;Jm!4!I", 15);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("'pi%:Md+xy2Q/<p", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("6\"M", 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("*", 5);
      assertEquals(5, int0);
  }
}