import java.util.*;

public class Target {

int skipSpace(String s,int i){
  int j=i;
  while (j < s.length() && Character.isWhitespace(s.charAt(j))) {
    ++j;
  }
  return j;
}
  int __target__(String s,int i){
  int j=i;
  while (j >= s.length() && Character.isWhitespace(s.charAt(j))) {
    ++j;
  }
  return j;
}

}