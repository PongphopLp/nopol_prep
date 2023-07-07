import java.util.*;

public class Target {

int stringComp(String v1,String v2){
  for (int i=0; i < v1.length() && i < v2.length(); i++) {
    if (v1.charAt(i) < v2.charAt(i))     return -1;
    if (v1.charAt(i) > v2.charAt(i))     return 1;
  }
  if (v1.length() < v2.length())   return -1;
  if (v1.length() > v2.length())   return 1;
  return 0;
}
  int __target__(String v1,String v2){
  for (int i=0; i < v1.length() && i < v2.length(); i++) {
    if (v1.charAt(i) < v2.charAt(i))     return -1;
    if (v1.charAt(i) > v2.charAt(i))     return 1;
  }
  if (v1.length() >= v2.length())   return -1;
  if (v1.length() > v2.length())   return 1;
  return 0;
}

}