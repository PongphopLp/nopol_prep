import java.util.*;

public class Target {

String tr(String input,String from,String to){
  assert from.length() == to.length();
  StringBuilder sb=null;
  int len=input.length();
  for (int i=0; i < len; i++) {
    int ind=from.indexOf(input.charAt(i));
    if (ind >= 0) {
      if (sb == null) {
        sb=new StringBuilder(input);
      }
      sb.setCharAt(i,to.charAt(ind));
    }
  }
  if (sb == null) {
    return input;
  }
 else {
    return sb.toString();
  }
}
  S__target__ing tr(String input,String from,String to){
  assert from.length() == to.length();
  StringBuilder sb=null;
  int len=input.length();
  for (int i=0; i < len; i++) {
    int ind=from.indexOf(input.charAt(i));
    if (ind >= 0) {
      if (sb == null) {
        sb=new StringBuilder(input);
      }
    }
  }
  if (sb == null) {
    return input;
  }
 else {
    return sb.toString();
  }
}

}