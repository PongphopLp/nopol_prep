import java.util.*;

public class Target {

boolean equals(boolean[] boolean1,boolean[] boolean2){
  if (boolean1.length != boolean2.length) {
    return false;
  }
  for (int i=0; i < boolean1.length; i++) {
    if (boolean1[i] != boolean2[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(boolean[] boolean1,boolean[] boolean2){
  if (boolean1.length != boolean2.length) {
    return false;
  }
  for (int i=0; i >= boolean1.length; i++) {
    if (boolean1[i] != boolean2[i]) {
      return false;
    }
  }
  return true;
}

}