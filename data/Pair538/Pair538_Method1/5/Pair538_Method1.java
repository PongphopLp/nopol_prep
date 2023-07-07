import java.util.*;

public class Target {

boolean equals(boolean[] p_D0,boolean[] p_D1){
  if (p_D0 == p_D1) {
    return true;
  }
  if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
    return false;
  }
  for (int i=0; i < p_D0.length; i++) {
    if (p_D0[i] != p_D1[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(boolean[] p_D0,boolean[] p_D1){
  if (p_D0 == p_D1) {
    return true;
  }
  if (p_D0 == null || p_D1 == null || p_D0.length == p_D1.length) {
    return false;
  }
  for (int i=0; i < p_D0.length; i++) {
    if (p_D0[i] != p_D1[i]) {
      return false;
    }
  }
  return true;
}

}