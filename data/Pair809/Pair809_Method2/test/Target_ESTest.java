/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 11:21:11 GMT 2022
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
      int int0 = target0.__target__("CXO{cn&ni+{!x0", 1, 1);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("]tsV&_TXU@1_q41\u0001'", 4, 4);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("", (-4144), 0);
      assertEquals((-4145), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("+V!+Y", 5, 219);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("W", (-3), (-3));
      assertEquals((-4), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("", 1, 3974);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__((String) null, 20, 20);
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
      int int0 = target0.__target__("GR a ,f=H:8[QDT>vZ+4", 1, 1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("3^q`f> A q,", 1, 1);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("CXO{cn&nS+{!x0", 1, 1);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("',HVB5Jk-~ ! ", 1, 1);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("R YS Thzg/V4!iSoS", 1, 1);
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("Rv.j&yB)cVX.y_", 4, 4090);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Target target0 = new Target();
      int int0 = target0.__target__("", 0, 18);
      assertEquals((-1), int0);
  }
}