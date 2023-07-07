import java.util.*;

public class Target {

String rpad(String value,char padding,int totalLength){
  if (value == null) {
    return value;
  }
  if (value.length() >= totalLength) {
    return value;
  }
  final StringBuffer sb=new StringBuffer(value);
  for (int i=0; i < totalLength - value.length(); i++) {
    sb.append(padding);
  }
  return sb.toString();
}
  String __target__(String value,char padding,int totalLength){
  if (value == null) {
    return value;
  }
  if (value.length() > totalLength) {
    return value;
  }
  final StringBuffer sb=new StringBuffer(value);
  for (int i=0; i < totalLength - value.length(); i++) {
    sb.append(padding);
  }
  return sb.toString();
}

}