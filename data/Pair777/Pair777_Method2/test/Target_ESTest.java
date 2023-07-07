/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 28 08:10:18 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Target_ESTest extends Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("id", "id", biFunction0);
      List<HashMap<String, Object>> list0 = List.of(hashMap0, hashMap0);
      Integer integer0 = Integer.valueOf(1);
      BiFunction<Object, Object, Integer> biFunction1 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("nbOccurences", integer0, biFunction1);
      int int0 = target0.__target__("id", list0, false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("id", "id", biFunction0);
      List<HashMap<String, Object>> list0 = List.of(hashMap0, hashMap0);
      int int0 = target0.__target__("jf", list0, false);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      List<HashMap<String, Object>> list0 = List.of(hashMap0, hashMap0);
      hashMap0.put("id", list0);
      // Undeclared exception!
      try { 
        target0.__target__("id", list0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.util.ImmutableCollections$List12 cannot be cast to class java.lang.String (java.util.ImmutableCollections$List12 and java.lang.String are in module java.base of loader 'bootstrap')
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("id", "id");
      List<HashMap<String, Object>> list0 = List.of(hashMap0, hashMap0);
      // Undeclared exception!
      try { 
        target0.__target__("id", list0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Target target0 = new Target();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("id", "id");
      List<HashMap<String, Object>> list0 = List.of(hashMap0, hashMap0);
      int int0 = target0.__target__("je", list0, true);
      assertEquals(0, int0);
  }
}