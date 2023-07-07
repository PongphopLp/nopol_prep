import java.util.*;

public class Target {

String join(List list,char delim){
  int len=list.size();
  if (len == 0) {
    return "";
  }
  StringBuffer sb=new StringBuffer();
  for (int i=0; i < (len - 1); i++) {
    sb.append(list.get(i));
    sb.append(delim);
  }
  sb.append(list.get(len - 1));
  return sb.toString();
}
  String __target__(List list,char delim){
  int len=list.size();
  if (len == 0) {
    return "";
  }
  StringBuffer sb=new StringBuffer();
  for (int i=0; i < (len - 1); i++) {
    sb.append(delim);
  }
  sb.append(list.get(len - 1));
  return sb.toString();
}

}