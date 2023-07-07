/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 27 10:28:18 GMT 2022
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
      // Undeclared exception!
      try { 
        target0.__target__((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("6pcTqM");
      assertEquals(72.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("2mm&|");
      assertEquals(5.6692915F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("9in(D");
      assertEquals(648.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("9F&_f-X.P.yWF");
      assertEquals(9.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("8 >Fg4Q8( C@1w%QN");
      assertEquals(8.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("5u)IDLW");
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("4 XDDm");
      assertEquals(4.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("3oX3x{4");
      assertEquals(3.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("1(EZI=Y");
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("0GXei:O0Zqm#");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("/bcb yXV)RuE 7<");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__(".$d-%XU");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("-7i FQ72y/OL?f*4'");
      assertEquals((-7.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__(",z@5,^-9+T,]wM:T3#");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__("+@r\"gVi");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Target target0 = new Target();
      float float0 = target0.__target__("6");
      assertEquals(6.0F, float0, 0.01F);
  }
}
