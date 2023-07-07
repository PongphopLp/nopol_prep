/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 05:06:36 GMT 2022
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
      // Undeclared exception!
      try { 
        target0.__target__((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("jJt~{");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("float");
      assertNotNull(class0);
      assertEquals("float", class0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("double");
      assertNotNull(class0);
      assertEquals("double", class0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("long");
      assertNotNull(class0);
      assertEquals("long", class0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("byte");
      assertEquals("byte", class0.toString());
      assertNotNull(class0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("boolean");
      assertNotNull(class0);
      assertEquals("boolean", class0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("short");
      assertNotNull(class0);
      assertEquals("short", class0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("int");
      assertTrue(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Target target0 = new Target();
      Class class0 = target0.__target__("char");
      assertEquals("char", class0.toString());
      assertNotNull(class0);
  }
}
