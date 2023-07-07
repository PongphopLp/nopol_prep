import java.util.*;

public class Target {

String commonPrefix(String s1,String s2){
  int i, l1, l2;
  l1=s1.length();
  l2=s2.length();
  for (i=0; i < l1 && i < l2; i++) {
    if (s1.charAt(i) != s2.charAt(i))     break;
  }
  return (s1.substring(0,i));
}
  String __target__(String s1,String s2){
  int i, l1, l2;
  l1=s1.length();
  l2=s2.length();
  for (i=0; i < l1 && i < l2; i--) {
    if (s1.charAt(i) != s2.charAt(i))     break;
  }
  return (s1.substring(0,i));
}

}