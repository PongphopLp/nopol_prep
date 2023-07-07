import java.util.*;

public class Target {

int findNumberEnd(String s,int i){
  int len=s.length();
  while (i < len && Character.isDigit(s.charAt(i))) {
    i++;
  }
  return i;
}
  int __target__(String s,int i){
  int len=s.length();
  while (i >= len && Character.isDigit(s.charAt(i))) {
    i++;
  }
  return i;
}

}