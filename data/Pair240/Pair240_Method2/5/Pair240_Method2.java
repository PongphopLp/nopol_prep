import java.util.*;

public class Target {

int compare(Object obj1,Object obj2){
  String s1=(String)obj1;
  String s2=(String)obj2;
  if (s1.length() < s2.length()) {
    return -1;
  }
 else   if (s1.length() > s2.length()) {
    return 1;
  }
 else {
    return s1.compareTo(s2);
  }
}
  int __target__(Object obj1,Object obj2){
  String s1=(String)obj1;
  String s2=(String)obj2;
  if (s1.length() < s2.length()) {
    return -1;
  }
 else   if (s1.length() >= s2.length()) {
    return 1;
  }
 else {
    return s1.compareTo(s2);
  }
}

}