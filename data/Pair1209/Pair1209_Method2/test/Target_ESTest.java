/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 29 09:39:20 GMT 2022
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
      target0.__target__("GlUI%ON", "", "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("uE4/G.S8O,:-yX^rgf.", "uE4/G.S8O,:-yX^rgf.", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("", "", "uE4/G.S8O,:-yX^rgf.");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__(")", "", (String) null);
      assertEquals(")", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("!_6{:1fb[--\"^#?>", (String) null, "");
      assertEquals("!_6{:1fb[--\"^#?>", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__("I0f*/P3S&d6l*VP", "v&nm@qWkl{", "v&nm@qWkl{");
      assertEquals("I0f*/P3S&d6l*VP", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Target target0 = new Target();
      String string0 = target0.__target__((String) null, (String) null, (String) null);
      assertNull(string0);
  }
}