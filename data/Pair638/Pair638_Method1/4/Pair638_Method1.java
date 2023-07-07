import java.util.*;

public class Target {

int findNextWhiteSpace(int i,String s){
  for (; i < s.length() && (s.charAt(i) != ' ' || s.charAt(i) != '\t'); i++) {
    ;
  }
  return i;
}
  int __target__(int i,String s){
  for (; i < s.length() && (s.charAt(i) != ' ' || s.charAt(i) == '\t'); i++) {
    ;
  }
  return i;
}

}