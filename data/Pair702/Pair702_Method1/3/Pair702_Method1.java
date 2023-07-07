import java.util.*;

public class Target {

String lPad(String s,int length,char c){
  if (length <= s.length()) {
    return s;
  }
  char[] pad=new char[length - s.length()];
  Arrays.fill(pad,c);
  return new String(pad) + s;
}
  String __target__(String s,int length,char c){
  if (length <= s.length()) {
    return s;
  }
  char[] pad=new char[length + s.length()];
  Arrays.fill(pad,c);
  return new String(pad) + s;
}

}