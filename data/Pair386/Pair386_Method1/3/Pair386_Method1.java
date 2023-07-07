import java.util.*;

public class Target {

String padStart(String str,char ch,int length){
  if (str.length() < length) {
    StringBuffer sb=new StringBuffer(ch);
    for (int i=0; i < (length - str.length()); i++) {
      sb.append(ch);
    }
    sb.append(str);
    return sb.toString();
  }
 else {
    return str;
  }
}
  String __target__(String str,char ch,int length){
  if (str.length() < length) {
    StringBuffer sb=new StringBuffer(ch);
    for (int i=0; i >= (length - str.length()); i++) {
      sb.append(ch);
    }
    sb.append(str);
    return sb.toString();
  }
 else {
    return str;
  }
}

}