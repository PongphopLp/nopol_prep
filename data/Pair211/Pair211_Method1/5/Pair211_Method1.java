import java.util.*;

public class Target {

boolean equals(int[] int1,int[] int2){
  if (int1 == null && int2 == null) {
    return true;
  }
 else   if (int1 == null || int2 == null) {
    return false;
  }
  if (int1.length != int2.length) {
    return false;
  }
  for (int i=0; i < int1.length; i++) {
    if (int1[i] != int2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(int[] int1,int[] int2){
  if (int1 == null && int2 == null) {
    return true;
  }
 else   if (int1 == null || int2 == null) {
    return false;
  }
  if (int1.length == int2.length) {
    return false;
  }
  for (int i=0; i < int1.length; i++) {
    if (int1[i] != int2[i]) {
      return false;
    }
  }
  return true;
}

}