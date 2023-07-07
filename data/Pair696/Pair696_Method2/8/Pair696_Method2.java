import java.util.*;

public class Target {

String pad(String s,int len,char c){
  int slen=s.length();
  if (slen >= len)   return s;
 else {
    char[] pad=new char[len - slen];
    for (int i=len - slen - 1; i >= 0; i--)     pad[i]=c;
    return s + new String(pad);
  }
}
  String __target__(String s,int len,char c){
  int slen=s.length();
  if (slen >= len)   return s;
 else {
    char[] pad=new char[len - slen];
    for (int i=len - slen - 1; i > 0; i--)     pad[i]=c;
    return s + new String(pad);
  }
}

}