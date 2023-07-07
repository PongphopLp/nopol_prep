import java.util.*;

public class Target {

boolean assertEqualsDoubleArrays1D(double[] expected,double[] actual){
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
  boolean __target__(double[] expected,double[] actual){
  boolean success=true;
  if (expected.length == actual.length)   return false;
  for (int i=0; i < expected.length; i++) {
    if (expected[i] != actual[i]) {
      success=false;
      break;
    }
  }
  return success;
}

}