import java.util.*;

public class Target {

boolean contains(CharSequence seq,CharSequence... any){
  for (int i=0; i < seq.length(); i++) {
    for (int j=0; j < any.length; j++) {
      if (seq.length() >= any[j].length()) {
        if (seq.subSequence(0,any[j].length()).equals(any[j]))         return true;
      }
    }
  }
  return false;
}
  boolean __target__(CharSequence seq,CharSequence... any){
  for (int i=0; i < seq.length(); i++) {
    for (int j=0; j < any.length; j++) {
      if (seq.length() < any[j].length()) {
        if (seq.subSequence(0,any[j].length()).equals(any[j]))         return true;
      }
    }
  }
  return false;
}

}