import java.util.*;

public class Target {

boolean startsWith(CharSequence seq,CharSequence... any){
  if (seq.length() > 0) {
    for (int i=0; i < any.length; i++) {
      if (seq.length() >= any[i].length())       if (seq.subSequence(0,any[i].length()).equals(any[i]))       return true;
    }
  }
  return false;
}
  boolean __target__(CharSequence seq,CharSequence... any){
  if (seq.length() <= 0) {
    for (int i=0; i < any.length; i++) {
      if (seq.length() >= any[i].length())       if (seq.subSequence(0,any[i].length()).equals(any[i]))       return true;
    }
  }
  return false;
}

}