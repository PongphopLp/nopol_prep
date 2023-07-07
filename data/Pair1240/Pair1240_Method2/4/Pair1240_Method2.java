import java.util.*;

public class Target {

int searchChar(String string,char c,int start){
  int i=start;
  while (i < string.length()) {
    if (string.charAt(i) == c) {
      return i;
    }
 else {
      i++;
    }
  }
  return -1;
}
  int __target__(String string,char c,int start){
  int i=start;
  while (i >= string.length()) {
    if (string.charAt(i) == c) {
      return i;
    }
 else {
      i++;
    }
  }
  return -1;
}

}