import java.util.*;

public class Target {

boolean sequencesEqual(CharSequence pSeq1,CharSequence pSeq2){
  if (pSeq1 == pSeq2) {
    return true;
  }
  if (pSeq1.length() != pSeq2.length()) {
    return false;
  }
  for (int i=0; i < pSeq1.length(); i++) {
    if (pSeq1.charAt(i) != pSeq2.charAt(i)) {
      return false;
    }
  }
  return true;
}
  boolean __target__(CharSequence pSeq1,CharSequence pSeq2){
  if (pSeq1 == pSeq2) {
    return true;
  }
  if (pSeq1.length() != pSeq2.length()) {
    return false;
  }
  for (int i=0; i < pSeq1.length(); i--) {
    if (pSeq1.charAt(i) != pSeq2.charAt(i)) {
      return false;
    }
  }
  return true;
}

}