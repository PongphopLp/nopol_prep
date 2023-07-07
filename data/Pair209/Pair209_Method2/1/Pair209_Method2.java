import java.util.*;

public class Target {

boolean assertEqualsIntArrays1D(int[] expected,int[] actual){
  boolean success=true;
  if (expected.length != actual.length)   return false;
  for (int i=0; i < expected.length; i++) {
    if (expected[i] != actual[i]) {
      success=false;
      break;
    }
  }
  return success;
}
  boolean __target__(int[] expected,int[] actual){
  boolean success=true;
  if (expected.length != actual.length)   return false;
  for (int i=0; i < expected.length; i--) {
    if (expected[i] != actual[i]) {
      success=false;
      break;
    }
  }
  return success;
}

}