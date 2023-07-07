import java.util.*;

public class Target {

boolean areEqualArrays(byte[] fixed,byte[] temp){
  for (int i=0; i < fixed.length; i++) {
    if (temp[i] != fixed[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] fixed,byte[] temp){
  for (int i=0; i < fixed.length; i--) {
    if (temp[i] != fixed[i])     return false;
  }
  return true;
}

}