/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 25 15:48:01 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      Vector<String> vector0 = new Vector<String>();
      String[] stringArray0 = new String[1];
      vector0.add("F.c`\"[");
      stringArray0[0] = "F.c`\"[";
      int[] intArray0 = target0.__target__(vector0, stringArray0, stringArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      String[] stringArray0 = new String[1];
      vector0.setSize(1669);
      stringArray0[0] = "r";
      Target target0 = new Target();
      target0.__target__(vector0, stringArray0, stringArray0);
      target0.__target__(vector0, stringArray0, stringArray0);
      // Undeclared exception!
      target0.__target__(vector0, stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      Vector<String> vector0 = new Vector<String>();
      String[] stringArray0 = new String[1];
      vector0.add("a2BH[");
      stringArray0[0] = "a2BH[";
      // Undeclared exception!
      try { 
        target0.__target__(vector0, stringArray0, stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"a2BH[\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add(">");
      Target target0 = new Target();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = new String[1];
      stringArray1[0] = ">";
      // Undeclared exception!
      try { 
        target0.__target__(vector0, stringArray0, stringArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("4");
      String[] stringArray0 = new String[8];
      stringArray0[0] = "4";
      stringArray0[1] = "4";
      stringArray0[2] = "4";
      stringArray0[3] = "";
      stringArray0[4] = "4";
      stringArray0[5] = "4";
      stringArray0[6] = "4";
      stringArray0[7] = "4";
      int[] intArray0 = target0.__target__(vector0, stringArray0, stringArray0);
      assertArrayEquals(new int[] {4, 4, 4, 4, 4, 4, 4}, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      vector0.add("q");
      String[] stringArray0 = new String[1];
      Target target0 = new Target();
      // Undeclared exception!
      try { 
        target0.__target__(vector0, stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
