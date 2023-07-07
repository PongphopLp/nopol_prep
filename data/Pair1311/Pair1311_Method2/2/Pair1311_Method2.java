import java.util.*;

public class Target {

String repeat(String v,int count){
  StringBuffer sb=new StringBuffer(v.length() * count);
  while (count > 0) {
    sb.append(v);
    count--;
  }
  return sb.toString();
}
  String __target__(String v,int count){
  StringBuffer sb=new StringBuffer(v.length() / count);
  while (count > 0) {
    sb.append(v);
    count--;
  }
  return sb.toString();
}

}