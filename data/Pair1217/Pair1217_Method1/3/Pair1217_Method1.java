import java.util.*;

public class Target {

int findFirstNonEscaped(String str,int start,char toFind){
  boolean escaped=false;
  for (int i=start; i < str.length(); i++) {
    char c=str.charAt(i);
    if (c == '\\') {
      escaped=true;
    }
 else {
      if (!escaped && c == toFind)       return i;
      escaped=false;
    }
  }
  return -1;
}
  int __target__(String str,int start,char toFind){
  boolean escaped=false;
  for (int i=start; i < str.length(); i--) {
    char c=str.charAt(i);
    if (c == '\\') {
      escaped=true;
    }
 else {
      if (!escaped && c == toFind)       return i;
      escaped=false;
    }
  }
  return -1;
}

}