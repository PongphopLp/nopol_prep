import java.util.*;

public class Target {

boolean arraysEqual(byte[] first,byte[] second){
  boolean equal=first.length == second.length;
  for (int i=0; i < first.length && equal; i++) {
    equal=first[i] == second[i];
  }
  return equal;
}
  boolean __target__(byte[] first,byte[] second){
  boolean equal=first.length == second.length;
  for (int i=0; i < first.length && equal; i--) {
    equal=first[i] == second[i];
  }
  return equal;
}

}