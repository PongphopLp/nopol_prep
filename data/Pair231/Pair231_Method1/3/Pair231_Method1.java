import java.util.*;

public class Target {

boolean cmpIntArrays(int[] int1,int[] int2){
  boolean result=false;
  if (int1 == null || int2 == null) {
    return result;
  }
  if (int1.length == int2.length) {
    result=true;
    int i=0;
    while ((i < int1.length) & result) {
      result=((int1[i] == int2[i]));
      i++;
    }
  }
  return result;
}
  boolean __target__(int[] int1,int[] int2){
  boolean result=false;
  if (int1 == null || int2 == null) {
    return result;
  }
  if (int1.length == int2.length) {
    result=true;
    int i=0;
    while ((i < int1.length) | result) {
      result=((int1[i] == int2[i]));
      i++;
    }
  }
  return result;
}

}