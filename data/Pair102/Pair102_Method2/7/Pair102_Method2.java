import java.util.*;

public class Target {

boolean isEqual(byte[] first,byte[] second){
  boolean out=first != null && second != null && first.length == second.length;
  for (int i=0; out && i < first.length; i++) {
    if (first[i] != second[i]) {
      out=false;
    }
  }
  return out;
}
  boolean __target__(byte[] first,byte[] second){
  boolean out=first != null && second != null && first.length == second.length;
  for (int i=0; out && i < first.length; i++) {
    if (first[i] == second[i]) {
      out=false;
    }
  }
  return out;
}

}