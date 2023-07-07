import java.util.*;

public class Target {

String paddingString(String s,int n,char c,boolean paddingLeft){
  StringBuffer str=new StringBuffer(s);
  int strLength=str.length();
  if (n > 0 && n > strLength) {
    for (int i=0; i <= n; i++) {
      if (paddingLeft) {
        if (i < n - strLength)         str.insert(0,c);
      }
 else {
        if (i > strLength)         str.append(c);
      }
    }
  }
  return str.toString();
}
  String __target__(String s,int n,char c,boolean paddingLeft){
  StringBuffer str=new StringBuffer(s);
  int strLength=str.length();
  if (n > 0 && n > strLength) {
    for (int i=0; i <= n; i++) {
      if (paddingLeft) {
        if (i >= n - strLength)         str.insert(0,c);
      }
 else {
        if (i > strLength)         str.append(c);
      }
    }
  }
  return str.toString();
}

}