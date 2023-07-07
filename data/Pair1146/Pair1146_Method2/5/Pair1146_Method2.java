import java.util.*;

public class Target {

boolean containsArrayString(String[] sarr,String str){
  boolean contains=false;
  if ((null != sarr) && (null != str)) {
    for (int i=0; (!contains) && (i < sarr.length); i++) {
      if (sarr[i].compareTo(str) == 0) {
        contains=true;
      }
    }
  }
  return contains;
}
  boolean __target__(String[] sarr,String str){
  boolean contains=false;
  if ((null != sarr) && (null != str)) {
    for (int i=0; (!contains) && (i < sarr.length); i++) {
      if (sarr[i].compareTo(str) != 0) {
        contains=true;
      }
    }
  }
  return contains;
}

}