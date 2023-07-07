import java.util.*;

public class Target {

String replaceStrings(String str,String f_s,String t_s){
  int pos=0;
  String res="";
  while (pos < str.length()) {
    int p1=str.indexOf(f_s,pos);
    if (p1 == -1) {
      res+=str.substring(pos);
      break;
    }
    res+=str.substring(pos,p1) + t_s;
    pos=p1 + f_s.length();
  }
  return (res);
}
  String __target__(String str,String f_s,String t_s){
  int pos=0;
  String res="";
  while (pos < str.length()) {
    int p1=str.indexOf(f_s,pos);
    if (p1 == 1) {
      res+=str.substring(pos);
      break;
    }
    res+=str.substring(pos,p1) + t_s;
    pos=p1 + f_s.length();
  }
  return (res);
}

}