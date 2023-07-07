/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 11:16:57 GMT 2022
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
      int int0 = target0.__target__("_?AZI7}%UvB`&n+4lYi", 1, 1);
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("E+SHX^.!/h<!", (-2368), 2461);
      assertEquals((-2369), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("W8MpulPU/|", 10, 290);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("", 1, (-2373));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, 19, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("lAYoE6[%i G 4[d]G", 1, 1);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("lA>jYo/fi y 4[d]G", 1, 1);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("lAYoE6[%i{ 6 4[dG", 1, 1);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("P-\";9UVr|+t ", 1, 1);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("Qx~X-/@Aq@&nwR/9!u;", 7, 7);
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("[qMDdrHvjJ%/wriZ<R!", 0, 649);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("nbI@BXn~bJ jAzN", 10, 13);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("9/~&. &qwc$Y)!l[xl", 45, 10);
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("9/~&. &qwc$Y)!l[xl", 1, 1);
      assertEquals(17, int0);
  }
}