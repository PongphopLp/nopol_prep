import java.util.*;

public class Target {

String paddedString(String src,char ch,int len){
  StringBuilder out=new StringBuilder(len);
  for (int i=len - src.length(); i > 0; i--) {
    out.append(ch);
  }
  return out.append(src).toString();
}
  String __target__(String src,char ch,int len){
  StringBuilder out=new StringBuilder(len);
  for (int i=len - src.length(); i > 0; i++) {
    out.append(ch);
  }
  return out.append(src).toString();
}

}